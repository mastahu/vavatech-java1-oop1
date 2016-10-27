package pl.vavatech;

public class PrzykladowyMain {

    public static void main(String[] args) {
        PrzykladKlasy bartek = new PrzykladKlasy(10, 20);
        PrzykladKlasy kasia = new PrzykladKlasy();
        bartek.przykladPola = 123;
        int przykładowaZmiennaLokalnaWMetodzie = bartek.przykladPola;

        int zdzisiek = 1;

        int wynikKasi = kasia.przykladowaMetoda(zdzisiek, 2, 3);
        System.out.println(wynikKasi);

        int wynikBartka = bartek.przykladowaMetoda(zdzisiek, 2, 3);
        System.out.println(wynikBartka);




    }
}
