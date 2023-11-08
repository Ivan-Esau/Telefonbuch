package Telefonbuch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Überprüfen Sie dieses Verhalten durch einen geeigneten JUnit-Test. (2)
class KontaktTest
{
    Kontakt ivan = new Kontakt("Esau", "Ivan", "015735370074");

    @Test
    public void setNameTest()
    {
        ivan.setName("Irgendwas");
        assertEquals("Irgendwas",ivan.getName());
    }

    @Test
    public void setVornameTest()
    {
        ivan.setVorname("Alex");;
        assertEquals("Alex",ivan.getVorname());
    }

    @Test
    public void setTelefonnummerTest()
    {
        ivan.setTelefonnummer("015735370074");
        assertEquals("015735370074", ivan.getTelefonnummer());
    }

}