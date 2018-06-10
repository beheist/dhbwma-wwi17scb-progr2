package collections.ex5_hashmap;

public class Student implements Comparable<Student> {
    private String vorname;
    private String nachname;
    private String matrikelNr;

    public Student(String vorname, String nachname, String matrikelNr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.matrikelNr = matrikelNr;
    }

    public int compareTo(Student s) {
        return Integer.parseInt(matrikelNr) - Integer.parseInt(s.getMatrikelNr());
    }

    public boolean equals(Object o) {
        // Alias-Check
        if (this == o) return true;
        // Test auf null
        if (o == null) return false;
        // Typverträglichkeit
        if (o.getClass() != this.getClass()) return false;
        // Feldvergleich
        if (!this.vorname.equals(((Student) o).getVorname())) return false;
        if (!this.nachname.equals(((Student) o).getNachname())) return false;
        if (!this.matrikelNr.equals(((Student) o).getMatrikelNr())) return false;
        // Alles gleich!
        return true;
    }

    public int hashCode() {
        return this.getMatrikelNr().hashCode() ^ this.getVorname().hashCode() ^ this.getNachname().hashCode();
    }

    public void print() {
        System.out.println(vorname + " " + nachname + " " + matrikelNr);
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getMatrikelNr() {
        return matrikelNr;
    }
}
