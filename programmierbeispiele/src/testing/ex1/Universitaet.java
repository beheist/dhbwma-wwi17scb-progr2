package testing.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Universitaet {
    private ArrayList<Student> studenten;
    private ArrayList<Vorlesung> vorlesungen;
    private String name;

    public Universitaet()
    {
        studenten = new ArrayList<>();
        vorlesungen = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // oops
    }

    public List<Student> getStudenten() {
        return studenten;
    }

    public boolean addStudent(Student s) {
        return studenten.add(s);
    }

    public List<Vorlesung> getVorlesungen() {
        return vorlesungen;
    }

    public boolean addVorlesung(Vorlesung v) {
        // this might have been accidentally commented out...
        // return vorlesungen.add(v);
        return true;
    }

    public void print() {
        System.out.println("Uni " + name + " hat " + getVorlesungen().size() + " Vorlesungen und " + getStudenten().size() + " Studenten.");
        System.out.println();
        Iterator<Student> i = studenten.iterator();
        while (i.hasNext()) {
            Student s = i.next();
            System.out.println(s.getVorlesungenString());
        }
    }
}
