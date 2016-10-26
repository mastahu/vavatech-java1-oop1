package pl.vavatech;

public class Mezczyzna extends Osoba {


    public Mezczyzna(String imie, String nazwisko, int wiek, int waga, int wzrost) {
        super(imie, nazwisko, wiek, waga, Plec.MĘŻCZYZNA,wzrost);
    }

//    public boolean czyJestWysoka() {
//        if(wzrost >= 180) {
//            return true;
//        } else {
//            return false;
//        }
//    }


}

