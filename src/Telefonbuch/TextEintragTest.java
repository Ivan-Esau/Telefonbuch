package Telefonbuch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextEintragTest
{
    /*
        Erzeugen Sie bitte einen Testfall, der als Parameter den String „Femmer; ;02331/9330-6293“
        übergibt und mit Hilfe der toString()-Methode der Klasse Kontakt die Funktionsweise von
        erzeugeEintrag (…) überprüft
     */
    @Test
    public void erzeugeEintragTest()
    {


        Kontakt femmer = TextEintrag.erzeugeEintrag("Femmer; ; 02331/9330-6293");

        String expectedName = "Femmer";
        String expectedVorname = "";
        String expectedTelefonnummer = "02331/9330-6293";
        String expectedToString = "Femmer; ; 02331/9330-6293";

        assertEquals(expectedName, femmer.getName()); // Prüft ob der Name korrekt ausgelesen worden ist.
        assertEquals(expectedVorname, femmer.getVorname());// Prüft die korrekte Übergabe des Vornamens
        assertEquals(expectedTelefonnummer, femmer.getTelefonnummer());
        assertEquals(expectedToString, femmer.toString());
    }

    /*
     VOR der Programmierung ermitteln Sie bitte diese Anzahl „per Hand“ und erstellen eine
     geeignete Testmethode um Ihr Ergebnis zu überprüfen.
     */
    @Test
    public void zeilenZaehlen()
    {
        String dateiName = "C:\\Users\\ivan.esau\\IdeaProjects\\Telefonbuch\\src\\Telefonbuch\\Kontakte.txt"; // Setzen Sie den Dateinamen auf den Namen Ihrer Textdatei

        int zeilenAnzahl = TextEintrag.zeilenZaehlen(dateiName);

        assertEquals(23, zeilenAnzahl);
    }
}