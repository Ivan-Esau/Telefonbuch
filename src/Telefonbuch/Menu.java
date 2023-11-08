package Telefonbuch;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kontakt[] kontakte = null;

        boolean beenden = false;

        while (!beenden) {
            System.out.println("Menü:");
            System.out.println("1. Adressen aus einer Datei laden");
            System.out.println("2. Nach einer Adresse suchen");
            System.out.println("3. Neue Adresse speichern");
            System.out.println("4. Programm beenden");

            System.out.print("Wählen Sie eine Option (1/2/3/4): ");

            if (scanner.hasNextInt()) {
                int auswahl = scanner.nextInt();
                scanner.nextLine();

                switch (auswahl) {
                    case 1:
                        System.out.print("Geben Sie den Dateinamen ein: ");
                        String dateiName = scanner.nextLine();
                        kontakte = TextEintrag.erstelleKontaktArray(dateiName);
                        System.out.println("Adressen aus der Datei geladen.");
                        break;
                    case 2:
                        if (kontakte != null) {
                            System.out.print("Geben Sie den Suchtext ein: ");
                            String suchtext = scanner.nextLine();
                            String treffer = KontaktSuchen.sucheKontakte(kontakte, suchtext);

                            System.out.println("Drücken Sie Enter, um fortzufahren...");
                            scanner.nextLine(); // Warte auf Enter
                        } else {
                            System.out.println("Es wurden noch keine Adressen geladen.");
                        }
                        break;
                    case 3:
                        if (kontakte != null) {
                            System.out.print("Geben Sie den Namen ein: ");
                            String name = scanner.nextLine();

                            System.out.print("Geben Sie den Vornamen ein: ");
                            String vorname = scanner.nextLine();

                            System.out.print("Geben Sie die Telefonnummer ein: ");
                            String telefonnummer = scanner.nextLine();

                            if (!name.isEmpty() && !vorname.isEmpty() && !telefonnummer.isEmpty()) {
                                Kontakt neuerKontakt = new Kontakt(name, vorname, telefonnummer);
                                Kontakt[] erweiterteKontakte = new Kontakt[kontakte.length + 1];
                                for (int i = 0; i < kontakte.length; i++) {
                                    erweiterteKontakte[i] = kontakte[i];
                                }
                                erweiterteKontakte[kontakte.length] = neuerKontakt;
                                kontakte = erweiterteKontakte;
                                System.out.println("Neuer Kontakt wurde gespeichert.");
                            } else {
                                System.out.println("Ungültige Eingabe. Name, Vorname und Telefonnummer dürfen nicht leer sein.");
                            }
                        } else {
                            System.out.println("Es wurden noch keine Adressen geladen.");
                        }
                        System.out.println("Drücken Sie Enter, um fortzufahren...");
                        scanner.nextLine(); // Warte auf Enter
                        break;
                    case 4:
                        beenden = true;
                        System.out.println("Programm wird beendet.");
                        break;
                    default:
                        System.out.println("Ungültige Auswahl. Bitte wählen Sie erneut.");
                        break;
                }
            } else {
                System.out.println("Ungültige Eingabe. Bitte wählen Sie erneut.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
