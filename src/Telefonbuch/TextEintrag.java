package Telefonbuch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class TextEintrag
{
    static ArrayList<String> daten = new ArrayList<>();

    /*
    Erstellen Sie bitte (in einer neuen Klasse) eine statische Methode erzeugeEintrag(…), die in
    einem gemeinsamen, zusammengefassten String die Werte eines Kontaktes übergeben
    bekommt (zum Beispiel „Weiss; Volker; 02331/9330-6726“).
    Dieser String soll dann innerhalb der Methode in seine einzelnen Bestandteile zerlegt werden
    und mit diesen ein Objekt der Klasse Kontakt angelegt werden, das dann mit return
    zurückgeliefert wird. (2)
    (Hinweis: Hier könnte die Methode split aus der Klasse String hilfreich sein)
     */
    public static Kontakt erzeugeEintrag(String eintrag)
    {
        String[] eintragTeile = eintrag.split("; ");
        if (eintragTeile.length == 3)
        {
            String name = eintragTeile[0];
            String vorname = eintragTeile[1];
            String telefonnummer = eintragTeile[2];
            return new Kontakt(name, vorname, telefonnummer);
        }
        else
        {
            // Hier könnten Sie eine Fehlerbehandlung oder Exception einfügen, wenn das Format nicht stimmt.
            return null;
        }
    }

    /*
   Programmieren Sie bitte eine statische Methode, mit der Sie zählen können, wie viele Zeilen
   in der angegebenen Textdatei gespeichert sind. (2)
   Wenn Sie die Methode nicht nur für eine spezielle Datei verwenden wollen, macht es Sinn,
   den Dateinamen als Parameter zu übergeben.
    */
    public static int zeilenZaehlen(String kontaktListe)
    {
        int zeilenAnzahl = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(kontaktListe))) {
            while (reader.readLine() != null) {
                zeilenAnzahl++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return zeilenAnzahl;
    }

    /*
    Ein Array aus Kontakten
    a) Erzeugen Sie bitte in einer statischen Methode ein Array aus Kontakten, das genau der
    ermittelten Anzahl der Zeilen in der Textdatei entspricht.
     */
    public static Kontakt[] erstelleKontaktArray(String dateiName) {
        int zeilenAnzahl = zeilenZaehlen(dateiName);
        Kontakt[] kontakte = new Kontakt[zeilenAnzahl];

        try (BufferedReader reader = new BufferedReader(new FileReader(dateiName))) {
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                kontakte[index] = erzeugeEintrag(line);
                index++;
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Fehler beim Lesen der Datei: " + e.getMessage());
        }

        return kontakte;
    }

}
