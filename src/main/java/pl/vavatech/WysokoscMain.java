package pl.vavatech;

public class WysokoscMain {

    public static void main(String[] args) {
        final Mezczyzna mezczyzna = new Mezczyzna("", "", 123, 100, 190);
        final Mezczyzna mezczyzna2 = new Mezczyzna("", "", 123, 100, 150);
        final Mezczyzna mezczyzna3 = new Mezczyzna("", "", 123, 100, 180);
        final Mezczyzna mezczyzna4 = new Mezczyzna("", "", 123, 100, 179);

        System.out.println(mezczyzna.czyJestWysoka());
        System.out.println(mezczyzna2.czyJestWysoka());
        System.out.println(mezczyzna3.czyJestWysoka());
        System.out.println(mezczyzna4.czyJestWysoka());

        final Kobieta kobieta = new Kobieta("", "", 123, 100, 190);
        final Kobieta kobieta2 = new Kobieta("", "", 123, 100, 140);
        final Kobieta kobieta3 = new Kobieta("", "", 123, 100, 150);
        final Kobieta kobieta4 = new Kobieta("", "", 123, 100, 149);

        System.out.println(kobieta.czyJestWysoka());
        System.out.println(kobieta2.czyJestWysoka());
        System.out.println(kobieta3.czyJestWysoka());
        System.out.println(kobieta4.czyJestWysoka());

    }



}
