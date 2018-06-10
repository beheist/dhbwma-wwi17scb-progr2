package collections.ex3_sortierung;

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
