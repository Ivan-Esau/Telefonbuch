package Telefonbuch;

public class KontaktSuchen
{
    public static String sucheKontakte(Kontakt[] kontakte, String suchtext) {
        StringBuilder treffer = new StringBuilder();

        for (Kontakt kontakt : kontakte) {
            if (kontakt != null && kontakt.toString().contains(suchtext)) {
                treffer.append(kontakt.toString()).append("\n");
            }
        }

        if (treffer.isEmpty())
        {
            System.out.println("Keine Treffer gefunden.");
        } else
        {
            System.out.println("Treffer:\n" + treffer);
        }

        return treffer.toString();
    }
}
