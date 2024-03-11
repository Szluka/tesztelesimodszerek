public class Torta {
    private int osszesSzelet;
    private int jelenlegiSzelet;
    private int retegekSzama;
    private String iz;

    public Torta(int szelet, int retegekSzama, String iz) {
        setOsszesSzelet(szelet);
        this.jelenlegiSzelet = szelet;
        this.retegekSzama = retegekSzama;
        this.iz = iz;
    }

    /**
     * Megadja, hogy elfogyott-e az adott torta
     * @return true, ha elfogyott a torta
     */
    public boolean elfogyott() {
        return jelenlegiSzelet == 0;
    }

    /**
     * Eszünk néhány szelet tortát.
     * @param mennyi megenni kívánt torta.
     * @return hány szelet tortát fogyasztottunk el.
     */
    public int tortaszeletekElfogyasztasa(int mennyi) {
        int elfogyaszthatoSzeletek = Math.min(mennyi, jelenlegiSzelet);
        jelenlegiSzelet -= elfogyaszthatoSzeletek;
        return elfogyaszthatoSzeletek;
    }

    /**
     * Eszünk egy szelet tortát
     */
    public void tortaszeletElfogyasztasa() {
        if (jelenlegiSzelet == 0) {
            System.out.println("Nincs mit elfogyasztani!");
            return;
        }
        this.jelenlegiSzelet--;
    }

    /**
     * Megadja, hogy a pénzünkért hány darab szelet tortát vehetünk.
     *
     * Az első szelet ára 0.1 fabatka.
     * Ezt követően minden további szelet 0.1 fabatkával drágább, mint az előző.
     *
     * @param penzunk amennyi pénzünk van tortára.
     * @return mennyi pénzünk maradt a végén
     */
    public double szeletVasarlas(double penzunk) {
        int megvettSutik = 0;
        for (double ar = 0.1; penzunk >= ar && megvettSutik < jelenlegiSzelet; ar += 0.1) {
            penzunk -= ar;
            System.out.println(penzunk);
            System.out.println(ar);
            ++megvettSutik;
            tortaszeletElfogyasztasa();
            System.out.println(jelenlegiSzelet);
        }
        return penzunk;
    }

    // Getterek és szetterek.

    public int getOsszesSzelet() {
        return osszesSzelet;
    }

    public void setOsszesSzelet(int osszesSzelet) {
        if (osszesSzelet < 0) {
            osszesSzelet = 0;
        }
        this.osszesSzelet = osszesSzelet;
        this.jelenlegiSzelet = osszesSzelet;
    }

    public int kremesRetegekSzama() {
        return retegekSzama / 2;
    }

    public int getJelenlegiSzelet() {
        return jelenlegiSzelet;
    }

    public String getIz() {
        return iz;
    }

    public void setIz(String iz) {
        this.iz = iz;
    }
}