import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TortaTest {

    @Test
    public void testTortaElfogyott() {
        Torta torta = new Torta(5, 2, "csokoládé");
        assertFalse(torta.elfogyott());

        torta.tortaszeletekElfogyasztasa(3);
        assertFalse(torta.elfogyott());

        torta.tortaszeletekElfogyasztasa(2);
        assertTrue(torta.elfogyott());
    }

    @Test
    public void testTortaszeletekElfogyasztasa() {
        Torta torta = new Torta(5, 2, "málna");

        assertEquals(2, torta.tortaszeletekElfogyasztasa(2));
        assertEquals(3, torta.getJelenlegiSzelet());

        assertEquals(3, torta.tortaszeletekElfogyasztasa(5));
        assertEquals(0, torta.getJelenlegiSzelet());

        assertEquals(0, torta.tortaszeletekElfogyasztasa(1));
        assertEquals(0, torta.getJelenlegiSzelet());
    }

    @Test
    public void testTortaszeletElfogyasztasa() {
        Torta torta = new Torta(3, 2, "eper");

        torta.tortaszeletElfogyasztasa();
        assertEquals(2, torta.getJelenlegiSzelet());

        torta.tortaszeletElfogyasztasa();
        assertEquals(1, torta.getJelenlegiSzelet());

        torta.tortaszeletElfogyasztasa();
        assertEquals(0, torta.getJelenlegiSzelet());

        torta.tortaszeletElfogyasztasa();
        assertEquals(0, torta.getJelenlegiSzelet());
    }

    @Test
    public void testSzeletVasarlas() {
        Torta torta = new Torta(9, 2, "vanília");

        assertEquals(0, torta.szeletVasarlas(0.1));
        assertEquals(8, torta.getJelenlegiSzelet());

        assertEquals(0.2, torta.szeletVasarlas(0.5));
        assertEquals(6, torta.getJelenlegiSzelet());

        assertEquals(0.5, torta.szeletVasarlas(1.1)); //megvettSutik < jelenlegiSzelet miatt!
        assertEquals(3, torta.getJelenlegiSzelet());

        assertEquals(0, torta.szeletVasarlas(0.1));
        assertEquals(2, torta.getJelenlegiSzelet());
    }

    @Test
    public void testKremesRetegekSzama() {
        Torta torta = new Torta(8, 4, "cseresznye");
        assertEquals(2, torta.kremesRetegekSzama());

        Torta torta2 = new Torta(6, 7, "gesztenye");
        assertEquals(3, torta2.kremesRetegekSzama());
    }
}
