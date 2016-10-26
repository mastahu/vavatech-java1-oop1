package pl.vavatech;

import java.util.ArrayList;

public class OsobaMain {

    public static void main(String[] args) {
        Osoba tato = new Osoba("Jan", "Kowalski", 35, 150);
        Osoba mama = new Osoba("Barbara", "Kowalska", 35, 40);
        Osoba corka = new Osoba("Alicja",  "Kowalska", 10, 20);
        Osoba syn = new Osoba("Stefan", "Kowalski", 10, 120);

        Osoba nn = new Osoba(null, null, 0, 50);

        System.out.println(tato.pelnoletnia()); // true
        System.out.println(corka.pelnoletnia()); // false


        ArrayList<Osoba> dzieci = new ArrayList<>();
        dzieci.add(corka);
        dzieci.add(syn);


        Rodzina kowalscy;
        try {

            kowalscy = new Rodzina(mama, tato, dzieci);

            //  Rodzina nowakowie = new Rodzina();


            int łacznaWagaRodziny = kowalscy.lacznaWaga();
            System.out.println("Rodzina wsiada do windy, obciążenie: " + łacznaWagaRodziny);

            final int wagaKowalskich = ParkRozrywki.lacznaWaga(kowalscy);

            System.out.println("Rodzina wsiada na karuzelę, obciążenie: " + wagaKowalskich);

        } catch (NullPointerException exception) {

        }
    }


}
