package pl.vavatech;

public class Osoba {

    String imie, nazwisko;
    int wiek;
    int waga;
    boolean pelnoletnia() {
        return wiek >= 18;
    }
}

