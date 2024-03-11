import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MacskaTest {

    @Test
    public void testMacskaConstructorWithNevAndBaratsagos() {
        Macska macska = new Macska("Cirmi", true);
        assertEquals("Cirmi", macska.getNev());
        assertEquals(6.0, macska.getSuly(), 0.0);
        assertTrue(macska.isBaratsagos());
        assertEquals(0, macska.getBolhakSzama());
    }

    @Test
    public void testMacskaConstructorWithNev() {
        Macska macska = new Macska("Cirmi");
        assertEquals("Cirmi", macska.getNev());
        assertEquals(10.0, macska.getSuly(), 0.0);
        assertTrue(macska.isBaratsagos());
        assertEquals(0, macska.getBolhakSzama());
    }

    @Test
    public void testMacskaDefaultConstructor() {
        Macska macska = new Macska();
        assertEquals("Kóbor cica", macska.getNev());
        assertEquals(6.0, macska.getSuly(), 0.0);
        assertFalse(macska.isBaratsagos());
        assertEquals(0, macska.getBolhakSzama());
    }

    @Test
    public void testNyavog() {
        Macska macska = new Macska("Cirmi", true);
        macska.nyavog();
        // Not much to assert in this method, just check if it doesn't throw any exceptions
    }

    @Test
    public void testKoborol() {
        Macska macska = new Macska("Cirmi", true);
        macska.koborol(5.0);
        assertEquals(5.75, macska.getSuly(), 0.01);
        assertEquals(1, macska.getBolhakSzama());
    }

    @Test
    public void testBolhatlanit() {
        Macska macska = new Macska("Cirmi", true);
        macska.koborol(5.0);
        macska.bolhatlanit();
        assertEquals(0, macska.getBolhakSzama());
    }

    @Test
    public void testSetAndGetSuly() {
        Macska macska = new Macska("Cirmi", true);
        macska.setSuly(7.5);
        assertEquals(7.5, macska.getSuly(), 0.0);
    }

    @Test
    public void testSetAndGetNev() {
        Macska macska = new Macska("Cirmi", true);
        macska.setNev("Dundi");
        assertEquals("Dundi", macska.getNev());
    }

    @Test
    public void testIsBaratsagos() {
        Macska macska = new Macska("Cirmi", true);
        assertTrue(macska.isBaratsagos());
    }

    @Test
    public void testGetBolhakSzama() {
        Macska macska = new Macska("Cirmi", true);
        macska.koborol(5.0);
        assertEquals(1, macska.getBolhakSzama());
    }
}

