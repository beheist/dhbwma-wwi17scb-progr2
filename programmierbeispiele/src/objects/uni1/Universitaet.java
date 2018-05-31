package objects.uni1;

public class Universitaet {
    private Student[] studenten;
    private Vorlesung[] vorlesungen;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudenten() {
        return studenten;
    }

    public void setStudenten(Student[] studenten) {
        this.studenten = studenten;
    }

    public Vorlesung[] getVorlesungen() {
        return vorlesungen;
    }

    public void setVorlesungen(Vorlesung[] vorlesungen) {
        this.vorlesungen = vorlesungen;
    }

    public void print(){
        System.out.println("Uni " + name + " hat " + vorlesungen.length + " Vorlesungen und " + studenten.length + " Studenten.");
        System.out.println();
        for(int i = 0; i < studenten.length; i++) {
            studenten[i].print();
        }
    }
}
