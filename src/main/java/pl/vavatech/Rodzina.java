package pl.vavatech;

import java.util.ArrayList;

public class Rodzina {
     Osoba mama;
     Osoba tata;
     ArrayList<Osoba> dzieci;

    public int lacznaWaga() {


       // Osoba tata = new Osoba();
        tata.waga = 123345;

        Rodzina mojaRodzina = this;
        int waga = mojaRodzina.tata.waga + mojaRodzina.mama.waga;


        for (int i =0; i < mojaRodzina.dzieci.size(); i++) {
            final Osoba kolejneDziecko = mojaRodzina.dzieci.get(i);
            final int wagaDziecka = kolejneDziecko.waga;
            waga += wagaDziecka;

        }



        return waga;
    }





}
