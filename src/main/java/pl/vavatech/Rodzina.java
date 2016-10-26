package pl.vavatech;

import java.util.ArrayList;

public class Rodzina {

    Osoba mama;
    Osoba tata;
    ArrayList<Osoba> dzieci;



    public Rodzina(Osoba mamaInit, Osoba tataInit, ArrayList<Osoba> dzieciInit) {
        if (mamaInit == null) {
            throw new NullPointerException("Parametr mamaInit jest obowiązkowy!!");
        }
        this.mama = mamaInit;
        this.tata = tataInit;
        this.dzieci = dzieciInit;
    }


    public Rodzina(final Osoba mama, final Osoba tata) {
        this(mama, tata, new ArrayList<Osoba>());
    }



    public int lacznaWaga() {

        int waga = tata.waga + mama.waga;

        for (int i = 0; i < dzieci.size(); i++) {
            final Osoba kolejneDziecko = dzieci.get(i);
            final int wagaDziecka = kolejneDziecko.waga;
            waga += wagaDziecka;

        }

        return waga;
    }


}
