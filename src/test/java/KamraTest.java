import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KamraTest {

    @Test
    public void testKamraKinaldMegAMacskattortaval() {
        Macska macska = new Macska("Cirmi", true);
        Torta torta = new Torta(8, 3, "csoki");
        Kamra kamra = new Kamra(macska, torta, 3);

        kamra.kinaldMegAMacskattortaval();

        assertEquals(7, torta.getJelenlegiSzelet());
        assertEquals(11, macska.getSuly());
    }

    @Test
    public void testKamraEtetMacska() {
        Macska macska = new Macska("Bogyó", true);
        Torta torta = new Torta(8, 3, "vanília");
        Kamra kamra = new Kamra(macska, torta, 2);

        kamra.etetMacska(4);

        assertEquals(8, macska.getSuly());
        assertEquals(1, macska.getSimogatasokSzama());

        kamra.etetMacska(2);

        kamra.etetMacska(4);

        assertEquals(11, macska.getSuly());
        assertEquals(3, macska.getSimogatasokSzama());
    }

    @Test
    public void testKamraBovites() {
        Macska macska = new Macska("Dundi", false);
        Torta torta = new Torta(8, 3, "eper");
        Kamra kamra = new Kamra(macska, torta, 4);

        assertEquals(5, kamra.getTeruletNegyzetmeterben());

        kamra.bovites(3);

        assertEquals(8, kamra.getTeruletNegyzetmeterben());
    }
}
