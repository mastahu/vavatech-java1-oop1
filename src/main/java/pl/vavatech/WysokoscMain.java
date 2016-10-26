package pl.vavatech;

public class WysokoscMain {

    public static void main(String[] args) {
        final Osoba mezczyzna = new Mezczyzna("", "", 123, 100, 190);
        final Osoba mezczyzna2 = new Mezczyzna("", "", 123, 100, 150);
        final Osoba mezczyzna3 = new Mezczyzna("", "", 123, 100, 180);
        final Osoba mezczyzna4 = new Mezczyzna("", "", 123, 100, 179);

        System.out.println(mezczyzna.czyJestWysoka());
        System.out.println(mezczyzna2.czyJestWysoka());
        System.out.println(mezczyzna3.czyJestWysoka());
        System.out.println(mezczyzna4.czyJestWysoka());

        final Osoba kobieta = new Kobieta("", "", 123, 100, 190);
        final Osoba kobieta2 = new Kobieta("", "", 123, 100, 140);
        final Osoba kobieta3 = new Kobieta("", "", 123, 100, 150);
        final Osoba kobieta4 = new Kobieta("", "", 123, 100, 149);

        System.out.println(kobieta.czyJestWysoka());
        System.out.println(kobieta2.czyJestWysoka());
        System.out.println(kobieta3.czyJestWysoka());
        System.out.println(kobieta4.czyJestWysoka());

    }



}
