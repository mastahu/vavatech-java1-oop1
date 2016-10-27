package pl.vavatech.bank;

import pl.vavatech.rodzina.Kobieta;
import pl.vavatech.rodzina.Mezczyzna;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {


        Konto konto = new Konto(new BigInteger("12345678901234567890123456"),new BigDecimal("0"),"PLN",new Mezczyzna("Jan", "Kowalski", 65, 12, 210));
        Konto konto2 = new Konto("12345678901234567890123457",new BigDecimal("0"),"PLN",new Kobieta("Jan", "Kowalski", 65, 12, 210));

        konto.wplac(new BigDecimal("1000.02"));


        System.out.println(konto.stanKonta);
    }
}
