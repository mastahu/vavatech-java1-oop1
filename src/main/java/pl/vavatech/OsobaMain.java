package pl.vavatech;

import java.util.ArrayList;

public class OsobaMain {

    public static void main(String[] args) {
        Osoba tato = new Osoba("Jan", "Kowalski", 35, 150, Plec.MĘŻCZYZNA, 170);
        Osoba mama = new Osoba("Barbara", "Kowalska", 35, 40, Plec.KOBIETA, 170);
        Osoba corka = new Osoba("Alicja", "Kowalska", 10, 20, Plec.KOBIETA, 170);
        Osoba syn = new Osoba("Stefan", "Kowalski", 10, 120, Plec.MĘŻCZYZNA, 170);

        Osoba nn = new Osoba(null, 0, 50);

        System.out.println(tato.pelnoletnia()); // true
        System.out.println(corka.pelnoletnia()); // false


        ArrayList<Osoba> dzieci = new ArrayList<>();
        dzieci.add(corka);
        dzieci.add(syn);


        Rodzina kowalscy;


        kowalscy = new Rodzina(mama, tato, dzieci);

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
    }


}
