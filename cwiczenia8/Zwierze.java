package cwiczenia8;

public abstract class Zwierze {
    protected String imie;
    protected int wiek;

    public Zwierze(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }
    public abstract String wydajDzwiek();
    public abstract String poruszajSie();

    public void wyswietlInformacje() {
        System.out.println("Zwierzę: " + imie + ", Wiek: " + wiek);
        System.out.println("Dźwięk: " + wydajDzwiek());
        System.out.println("Ruch: " + poruszajSie());
    }
}