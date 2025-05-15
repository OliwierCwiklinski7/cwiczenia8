package cwiczenia8;

class Gad extends Zwierze {
    private boolean jadowity;
    // dziala kod
    public Gad(String nazwa, int wiek, boolean jadowity) {
        super(nazwa, wiek);
        this.jadowity = jadowity;
    }

    public boolean isJadowity() {
        return jadowity;
    }

    public String wydajDzwiek() {
        return "Syczy";
    }

    public String poruszajSie() {
        return "Pełza";
    }

}