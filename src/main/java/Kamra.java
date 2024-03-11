public class Kamra {

    private double teruletNegyzetmeterben; //m^2-ben

    private int polcokSzama;

    private double hasznosTerulet;
    private Macska macska;
    private Torta torta;

    public Kamra(Macska macska, Torta torta, int polcokSzama) {
        this.teruletNegyzetmeterben = 5;
        this.polcokSzama = polcokSzama;
        this.macska = macska;
        this.torta = torta;
        this.hasznosTerulet = getHasznosTerulet();
    }

    public void kinaldMegAMacskattortaval() {
        torta.tortaszeletElfogyasztasa();
        macska.eszik(10);
    }

    public void etetMacska(int etelMennyiseg) {
        macska.eszik(etelMennyiseg);
        macska.setSimogatasokSzama(macska.getSimogatasokSzama()+1); // Macska boldogságának növelése
    }

    public void bovites(int negyzetmeter) {
        teruletNegyzetmeterben += negyzetmeter;
    }

    public void informacioKiiras() {
        System.out.println("\nKamra információk:");
        System.out.println("Macska információ:");
        System.out.println("Név: " + macska.getNev());
        System.out.println("Súly: " + macska.getSuly());
        System.out.println("Barátságos: " + macska.isBaratsagos());
        System.out.println("Bolhák száma: " + macska.getBolhakSzama());

        System.out.println("\nTorta információ:");
        System.out.println("Összes szelet: " + torta.getOsszesSzelet());
        System.out.println("Jelenlegi szelet: " + torta.getJelenlegiSzelet());
        System.out.println("Íz: " + torta.getIz());
        System.out.println("Kremes rétegek száma: " + torta.kremesRetegekSzama());
    }

    public static void main(String[] args) {
        Macska macska = new Macska("Cirmi", true);
        Torta torta = new Torta(8, 3, "csoki");

        Kamra kamra = new Kamra(macska, torta, 3);
        kamra.kinaldMegAMacskattortaval();
        kamra.informacioKiiras();
        kamra.etetMacska(5);
    }

    public double getHasznosTerulet() {
        return getTeruletNegyzetmeterben() - this.getPolcokSzama()*0.5;
    }

    public int getPolcokSzama() {
        return polcokSzama;
    }

    public void setPolcokSzama(int polcokSzama) {
        this.polcokSzama = polcokSzama;
    }

    public double getTeruletNegyzetmeterben() {
        return teruletNegyzetmeterben;
    }

    public Macska getMacska() {
        return macska;
    }

    public void setMacska(Macska macska) {
        this.macska = macska;
    }

    public Torta getTorta() {
        return torta;
    }

    public void setTorta(Torta torta) {
        this.torta = torta;
    }
}