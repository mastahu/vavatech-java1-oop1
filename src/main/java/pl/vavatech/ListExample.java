package pl.vavatech;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Osoba> dzieci = new ArrayList<>();

        dzieci.add(new Osoba());
        dzieci.add(new Osoba());
        dzieci.add(new Osoba());

        int size = dzieci.size();

        System.out.println(size);

        Osoba średnieDziecko = dzieci.get(1);
        
    }
}
