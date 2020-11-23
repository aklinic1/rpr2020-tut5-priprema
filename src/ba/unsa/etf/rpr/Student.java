package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String ime, prezime;
    private final int index;
    private List<Predmet> izborni = new ArrayList<Predmet>();

    public Student(String ime, String prezime, int index) {
        this.ime = ime;
        this.prezime = prezime;
        this.index = index;
    }

}
