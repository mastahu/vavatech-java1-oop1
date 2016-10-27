package pl.vavatech.rodzina;

public class Mezczyzna extends Osoba {


    public Mezczyzna(String imie, String nazwisko, int wiek, int waga, int wzrost) {
        super(imie, nazwisko, wiek, waga, Plec.MĘŻCZYZNA,wzrost);
    }


    @Override
    public boolean czyJestWysoka() {
        System.out.println("MEZCZ");
        if(wzrost >= 180) {
            return true;
        } else {
            return false;
        }
    }


    public static void costam() {
        System.out.println("mezczyzna");
    }

}

