package pl.vavatech;

public class Kobieta extends Osoba {


    public Kobieta(String imie, String nazwisko, int wiek, int waga, int wzrost) {
        super(imie, nazwisko, wiek, waga, Plec.KOBIETA,wzrost);
    }

//    public boolean czyJestWysoka() {
//        return wzrost >= 150;
//    }


}

