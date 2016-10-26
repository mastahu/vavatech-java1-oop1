package pl.vavatech;

import java.util.ArrayList;

public class OsobaMain {

    public static void main(String[] args) {
        Osoba tato = null;


        tato = new Osoba();
        tato.imie = "Jan";
        tato.nazwisko = "Kowalski";
        tato.wiek = 35;
        tato.waga = 150;

        Osoba mama = new Osoba();
        mama.imie = "Barbara";
        mama.nazwisko = "Kowalska";
        mama.wiek = 35;
        mama.waga = 40;


        Osoba corka = new Osoba();
        corka.imie = "Alicja";
        corka.nazwisko = "Kowalska";
        corka.wiek = 10;
        corka.waga = 20;

        Osoba syn = new Osoba();
        syn.imie = "Alicja";
        syn.nazwisko = "Kowalska";
        syn.wiek = 10;
        syn.waga = 120;

        System.out.println(tato.pelnoletnia()); // true
        System.out.println(corka.pelnoletnia()); // false


        ArrayList<Osoba> dzieci = new ArrayList<>();
        dzieci.add(corka);
        dzieci.add(syn);


        Rodzina kowalscy;
        try {

            kowalscy = new Rodzina(null, tato, dzieci);


            //  Rodzina nowakowie = new Rodzina();


            int łacznaWagaRodziny = kowalscy.lacznaWaga();
            System.out.println("Rodzina wsiada do windy, obciążenie: " + łacznaWagaRodziny);

            final int wagaKowalskich = ParkRozrywki.lacznaWaga(kowalscy);

            System.out.println("Rodzina wsiada na karuzelę, obciążenie: " + wagaKowalskich);

        } catch (NullPointerException exception) {

        }
    }


}
