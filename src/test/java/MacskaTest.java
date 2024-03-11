import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MacskaTest {

    @Test
    public void testMacskaNyavog() {
        Macska macska = new Macska("Cirmi", true);
        macska.nyavog(); // Just check if there are no exceptions
    }

    @Test
    public void testMacskaKoborol() {
        Macska macska = new Macska("Bogyó", true);
        macska.koborol(30);
        assertEquals(4.5, macska.getSuly());
        assertTrue(macska.getBolhakSzama() > 0);

        macska.koborol(15);
        assertEquals(3.75, macska.getSuly());
        assertTrue(macska.getBolhakSzama() > 0);
    }

    @Test
    public void testMacskaBolhatlanit() {
        Macska macska = new Macska("Dundi", false);
        macska.koborol(40);
        macska.bolhatlanit();
        assertEquals(0, macska.getBolhakSzama());
    }

    @Test
    public void testMacskaDefaultConstructor() {
        Macska macska = new Macska();
        assertEquals("Kóbor cica", macska.getNev());
        assertFalse(macska.isBaratsagos());
        assertEquals(6, macska.getSuly());
        assertEquals(0, macska.getBolhakSzama());
    }

    @Test
    public void testMacskaParameterizedConstructors() {
        Macska macska1 = new Macska("Mázli");
        assertEquals("Mázli", macska1.getNev());
        assertTrue(macska1.isBaratsagos());
        assertEquals(10, macska1.getSuly());
        assertEquals(0, macska1.getBolhakSzama());

        Macska macska2 = new Macska("Morzsi", false);
        assertEquals("Morzsi", macska2.getNev());
        assertFalse(macska2.isBaratsagos());
        assertEquals(6, macska2.getSuly());
        assertEquals(0, macska2.getBolhakSzama());
    }
}
