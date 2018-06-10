package collections.ex1_uni;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private ArrayList besuchteVorlesungen;
    private String vorname;
    private String nachname;

    private Student() {
    }

    public Student(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.besuchteVorlesungen = new ArrayList();
    }

    public void print() {
        System.out.print("Student " + vorname + " " + nachname + " hört: ");
        Iterator i = besuchteVorlesungen.iterator();
        while (i.hasNext()) {
            Vorlesung v = (Vorlesung) i.next();
            v.print();
            if (i.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public List getBesuchteVorlesungen() {
        return besuchteVorlesungen;
    }

    public boolean besucheVorlesung(Vorlesung vl) {
        vl.addStudent(this);
        return besuchteVorlesungen.add(vl);
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
