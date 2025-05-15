package cwiczenia8;

class Ptak extends Zwierze {
    private boolean czylata;

    public Ptak(String nazwa, int wiek, boolean czylata) {
        super(nazwa, wiek);
        this.czylata = czylata;
    }

    public boolean getczylata() {
        return czylata;
    }

    public String wydajDzwiek() {
        return "Ćwierkanie";
    }

    public String poruszajSie() {
        return "Lata";
    }
}

