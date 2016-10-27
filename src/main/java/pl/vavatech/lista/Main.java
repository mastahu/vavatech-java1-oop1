package pl.vavatech.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> imiona = new ArrayList<>();
        imiona.add("Piotrek");
        imiona.add("Zdzisiek");
        Scanner scanner = new Scanner(System.in);
        ListaObecnosci listaObecnosci = new ListaObecnosciZrobionaZRemovem(imiona);
        while (!listaObecnosci.czyWszyscySaObecni()) {
            System.out.println("Podaj imię:");
            String imie = scanner.next();
            listaObecnosci.potwierdzObecnosc(imie);
        }

        System.out.println("Wszyscy obecni!");


    }
}
