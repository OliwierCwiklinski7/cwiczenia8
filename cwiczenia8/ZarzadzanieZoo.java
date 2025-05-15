package cwiczenia8;

public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze lew = new Ssak("Lew", 5, "puszyste");
        Zwierze orzel = new Ptak("Orzeł", 3, true);
        Zwierze wez = new Gad("Wąż", 2, true);

        Zwierze[] zwierzeta = { lew, orzel, wez };
        // dziala kod

        for (Zwierze z : zwierzeta) {
            z.wyswietlInformacje();
            System.out.println("------------");
        }
    }
}