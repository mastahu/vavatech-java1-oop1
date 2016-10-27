package pl.vavatech.lista;

import java.util.List;

public class ListaObecnosciZrobionaZRemovem extends ListaObecnosci {

    private List<String> listaDoOhaczenia;

    public ListaObecnosciZrobionaZRemovem(List<String> listaDoOhaczenia) {
        this.listaDoOhaczenia = listaDoOhaczenia;
    }

    @Override
    public boolean czyWszyscySaObecni() {
        return listaDoOhaczenia.isEmpty();
    }

    @Override
    public void potwierdzObecnosc(String imie) {
        listaDoOhaczenia.remove(imie);
    }
}
