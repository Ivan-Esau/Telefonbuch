package Telefonbuch;
public class AltMain
{

    public static void main(String[] args)
    {
        /*
        Demonstrieren Sie, dass Ihre Klasse funktioniert, indem Sie in einer neuen Klasse zwei
        Objekte der Klasse Kontakt anlegen und die gespeicherten Daten auf dem Bildschirm
        anzeigen lassen.
         */
        String dateiName = "C:\\Users\\ivan.esau\\IdeaProjects\\Telefonbuch\\src\\Telefonbuch\\Kontakte.txt"; // Setzen Sie den Dateinamen auf den Namen Ihrer Textdatei

        Kontakt volker = new Kontakt("Weiss", "Volker", "02331/9330-6726");
        Kontakt maria = TextEintrag.erzeugeEintrag("Meier; Maria; 01234/5678-9012");

        System.out.println(volker);
        System.out.println(maria);


        int zeilenAnzahl = TextEintrag.zeilenZaehlen(dateiName);
        System.out.println("Anzahl der Zeilen in der Datei: " + zeilenAnzahl);

        /*
        5) Befüllen des Arrays
        a) Füllen Sie das Array aus der Aufgabe 4 mit Kontakten, die Sie aus den einzelnen Zeilen der
        Textdatei generieren.
         */
        Kontakt[] kontakte = TextEintrag.erstelleKontaktArray(dateiName);

        for (Kontakt kontakt : kontakte)
        {
            if (kontakt != null)
            {
                System.out.println(kontakt.toString()); // Beispiel: Ausgabe der Kontaktinformationen
            }
        }

        String sucheName = "Peter";
        String sucheNummer = "732";


        String trefferName = KontaktSuchen.sucheKontakte(kontakte, sucheName);
        String trefferNummer = KontaktSuchen.sucheKontakte(kontakte, sucheNummer);

    }
}
