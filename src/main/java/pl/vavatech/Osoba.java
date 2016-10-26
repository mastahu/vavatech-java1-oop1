package pl.vavatech;

public abstract class Osoba {

    private String imie, nazwisko;
    private int wiek;
    private int waga;
    private Plec plec;
    private int wzrost;


    public Osoba(String imie, String nazwisko, int wiek, int waga, Plec plec, int wzrost) {
        this.plec = plec;
        this.wzrost = wzrost;
        if (imie != null) {
            this.imie = imie;
        } else {
            this.imie = "Piotrek";
        }
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.waga = waga;
    }

    public Osoba(String nazwisko, int wiek, int waga) {
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.waga = waga;
        this.imie = "Piotrek";
    }

    boolean pelnoletnia() {
        return wiek >= 18;
    }

    int podajWagę() {
        return waga;
    }

    public boolean czyJestWysoka() {
        if(plec == Plec.MĘŻCZYZNA && wzrost >= 180 || plec == Plec.KOBIETA && wzrost >= 150) {
            return true;
        } else {
            return false;
        }
    }


}

