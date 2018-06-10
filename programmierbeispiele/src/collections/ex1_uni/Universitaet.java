package collections.ex1_uni;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Universitaet {
    private ArrayList studenten;
    private ArrayList vorlesungen;
    private String name;

    public Universitaet()
    {
        studenten = new ArrayList();
        vorlesungen = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getStudenten() {
        return studenten;
    }

    public boolean addStudent(Student s) {
        return studenten.add(s);
    }

    public List getVorlesungen() {
        return vorlesungen;
    }

    public boolean addVorlesung(Vorlesung v) {
        return vorlesungen.add(v);
    }

    public void print() {
        System.out.println("Uni " + name + " hat " + getVorlesungen().size() + " Vorlesungen und " + getStudenten().size() + " Studenten.");
        System.out.println();
        Iterator i = studenten.iterator();
        while (i.hasNext()) {
            Student s = (Student) i.next();
            s.print();
        }
    }
}
