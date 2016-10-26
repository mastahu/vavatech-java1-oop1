package pl.vavatech;

public class Osoba {

    private String imie, nazwisko;
    private int wiek;
    private int waga;

    public Osoba(String imie, String nazwisko, int wiek, int waga) {
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
}

