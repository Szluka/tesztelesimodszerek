public class Macska {
    private String nev;
    private double suly;
    private boolean baratsagos;
    private int bolhakSzama;
    private int simogatasokSzama = 0;

    public Macska(String nev, boolean baratsagos) {
        this.nev = nev;
        this.suly = 6;
        this.baratsagos = baratsagos;
        this.bolhakSzama = 0;
    }

    public Macska(String nev) {
        this.nev = nev;
        this.suly = 10;
        this.baratsagos = true;
        this.bolhakSzama = 0;
    }

    public Macska() {
        this("Kóbor cica", false);
    }

    public void nyavog() {
        String meow = "Me";
        for (int i = 0; i < suly; i++) {
            if (i % 2 == 0) {
                meow += "o";
            } else {
                meow += "O";
            }
        }
        meow += "w";
        System.out.println(nev + " nyávog: " + meow);
    }

    public void koborol(double tav) {
        suly -= (tav / 20);         //Itt direkt nem ellenőrzöm, hogy nulla alá megy-e
        bolhakSzama += (tav / 20) + 1;
    }

    public void eszik(int etelMennyiseg) {
        System.out.println(nev + " eszik " + etelMennyiseg + " egység ételt.");
        suly += etelMennyiseg / 2;
    }

    public void bolhatlanit() {
        this.bolhakSzama = 0;
    }

    public double getSuly() {
        return suly;
    }

    public void setSuly(double suly) {
        this.suly = suly;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public boolean isBaratsagos() {
        return baratsagos;
    }

    public int getBolhakSzama() {
        return bolhakSzama;
    }

    public int getSimogatasokSzama() {
        return simogatasokSzama;
    }

    public void setSimogatasokSzama(int simogatasokSzama) {
        this.simogatasokSzama = simogatasokSzama;
    }
}