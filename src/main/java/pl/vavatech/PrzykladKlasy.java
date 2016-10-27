package pl.vavatech;

class PrzykladKlasy {

    int przykladPola;

    PrzykladKlasy(int przykładowyParametr1, int przykładowyParametr2) {

    }

    PrzykladKlasy() {

    }

    int przykladowaMetoda(int przykładowyParametr1, int przykładowyParametr2, int zdzisiek){
        return przykładowyParametr1 / przykładowyParametr2 + zdzisiek - przykladPola;
    }


    void wezUstawPolePrzykladPola(int wartosc) {
        this.przykladPola = wartosc;
    }


}
