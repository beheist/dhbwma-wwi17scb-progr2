package testing.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("Duplicates")
public class Student {
    private ArrayList<Vorlesung> besuchteVorlesungen;
    private String vorname;
    private String nachname;

    private Student() {
    }

    public Student(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.besuchteVorlesungen = new ArrayList<Vorlesung>();
    }

    public String getVorlesungenString() {
        StringBuffer s = new StringBuffer();
        s.append("Student " + vorname + " " + nachname + " hört: ");
        Iterator<Vorlesung> i = besuchteVorlesungen.iterator();
        while (i.hasNext()) {
            Vorlesung v = i.next();
            s.append(v.toString());
            s.append(", ");
        }
        return s.toString();
    }

    public List<Vorlesung> getBesuchteVorlesungen() {
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
