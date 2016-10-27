package pl.vavatech.bank;

import pl.vavatech.rodzina.Osoba;
import java.lang.String;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Konto {

    BigInteger numerKonta;
    BigDecimal stanKonta;
    String waluta;
    Osoba właściciel;

    public Konto(String numerKonta, BigDecimal stanKonta, String waluta, Osoba właściciel) {
        this.numerKonta = new BigInteger(numerKonta);
        this.stanKonta = stanKonta;
        this.waluta = waluta;
        this.właściciel = właściciel;
    }

    public Konto(BigInteger numerKonta, BigDecimal stanKonta, String waluta, Osoba właściciel) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
        this.waluta = waluta;
        this.właściciel = właściciel;
    }

    public void wplac(BigDecimal kwota) {
        stanKonta = stanKonta.add(kwota);
    }


}
