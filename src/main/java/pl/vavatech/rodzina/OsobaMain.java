package pl.vavatech.rodzina;

import java.util.ArrayList;

public class OsobaMain {

    public static void main(String[] args) {
        Osoba tato = new Mezczyzna("Jan", "Kowalski", 35, 150, 170);
        Osoba mama = new Kobieta("Barbara", "Kowalska", 35, 40, 170);
        Osoba corka = new Kobieta("Alicja", "Kowalska", 10, 20, 170);
        Osoba syn = new Mezczyzna("Stefan", "Kowalski", 10, 120, 170);


        System.out.println(tato.pelnoletnia()); // true
        System.out.println(corka.pelnoletnia()); // false


        ArrayList<Osoba> dzieci = new ArrayList<>();
        dzieci.add(corka);
        dzieci.add(syn);


        Rodzina kowalscy = new Rodzina(mama, tato, dzieci);

        //  Rodzina nowakowie = new Rodzina();

        int łacznaWagaRodziny = kowalscy.lacznaWaga();
        System.out.println("Rodzina wsiada do windy, obciążenie: " + łacznaWagaRodziny);

        final int wagaKowalskich = ParkRozrywki.lacznaWaga(kowalscy);

        System.out.println("Rodzina wsiada na karuzelę, obciążenie: " + wagaKowalskich);

        System.out.println("Czy mama jest wyskoka: " + mama.czyJestWysoka());

        System.out.println();

        try {
            new Rodzina(null, tato, dzieci);
        } catch (NullPointerException exception) {
            System.out.println("OOOOO : "+ exception);
        }



        System.out.println(mama.pelnoletnia());
    }


}
