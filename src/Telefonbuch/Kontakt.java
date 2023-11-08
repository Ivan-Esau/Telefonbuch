package Telefonbuch;
// Erstellen Sie bitte eine Klasse Kontakt, in der der Name, Vorname und Telefonnummer als Objektvariablen gespeichert werden.
public class Kontakt
{
    // Programmieren Sie für die Klasse Kontakt einen Konstruktor, der den Instanzvariablen beim Erstellen einer neuen Instanz (Objekt zu dieser Klasse) Werte zuweist.
    private String name;
    private String vorname;
    private String telefonnummer;

    public Kontakt(String name, String vorname, String telefonnummer)
    {
        if (name != null) {
            this.name = name;
        }
        else
        {
            this.name = "";
        }

        if (vorname != null)
        {
            this.vorname = vorname;
        }
        else
        {
            this.vorname = "";
        }

        if(telefonnummer != null)
        {
            this.telefonnummer = telefonnummer;
        }
        else
        {
            this.telefonnummer = "";
        }
    }

    // Zugriffe auf die Instanzvariablen sollen in dieser Klasse nur über get- und set- Methoden möglich sein.

    //Stellen Sie bei der Programmierung sicher, dass die Instanzvariablen des Kontakts niemals null werden können – zum Beispiel, indem Sie im Konstruktor und den set-Methoden einenleeren String in die jeweiligen Attribute eintragen, falls null übergeben werden sollte.
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if (name != null) {
            this.name = name;
        }
        else
        {
            this.name = "";
        }
    }

    public String getVorname()
    {
        return vorname;
    }

    public void setVorname(String vorname)
    {
        if (vorname != null)
        {
            this.vorname = vorname;
        }
        else
        {
            this.vorname = "";
        }
    }

    public String getTelefonnummer()
    {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer)
    {

        if(telefonnummer != null)
        {
            this.telefonnummer = telefonnummer;
        }
        else
        {
            throw new IllegalArgumentException("");
        }
    }

    /*
    Erstellen Sie eine Methode public String toString(), die Daten eines Kontaktes in der
    Reihenfolge Name, Vorname, Telefonnummer zurückgibt, jeweils getrennt durch ein Semikolon:
    Weiss; Volker; 02331/9330-6726
     */
    @Override
    public String toString()
    {
        return name + "; " + vorname + "; " + telefonnummer;
    }
}