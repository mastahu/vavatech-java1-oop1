package company;
public class Osoba {   ///shift f6 zmiana nazwa klasy
String imie, nazwisko;
    int wiek;
    int waga;
    double wzrost;
    boolean pelnoletnia(){
        return wiek >= 18;
    }
    boolean wysoka() {
        return wzrost >= 1.90;
    }


}