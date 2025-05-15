package cwiczenia8;

class Ssak extends Zwierze {
    private String futro;
    // dziala kod
    public Ssak(String nazwa, int wiek, String futro) {
        super(nazwa, wiek);
        this.futro = futro;
    }

    public String wydajDzwiek() {
        return "Ryk";
    }

    public String poruszajSie() {
        return "Biega";
    }
}