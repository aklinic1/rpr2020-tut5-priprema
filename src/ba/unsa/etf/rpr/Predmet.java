package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Predmet {
    private String naziv;
    private int ECTS;
    private List<Student> upisaniStudenti = new ArrayList<Student>();

    private Predmet() {}

    public Predmet(String naziv, int ECTS) {
        this.naziv = naziv;
        this.ECTS = ECTS;
    }
    public upisiStudenta(Student student){
        upisaniStudenti.add(student);
    }
    public List<Student> getUpisaniStudenti() {
        return upisaniStudenti;
    }
}
