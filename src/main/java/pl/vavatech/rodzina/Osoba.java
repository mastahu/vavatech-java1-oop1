package pl.vavatech.rodzina;

public abstract class Osoba {

    private String imie, nazwisko;
    private int wiek;
    private int waga;
    private Plec plec;
    protected int wzrost;


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

    boolean pelnoletnia() {
        return wiek >= 18;
    }

    int podajWagę() {
        return waga;
    }

    public abstract boolean czyJestWysoka();

}

