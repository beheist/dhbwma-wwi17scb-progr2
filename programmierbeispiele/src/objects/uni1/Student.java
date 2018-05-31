package objects.uni1;

public class Student {
    private Vorlesung[] besuchteVorlesungen;
    private int anzahlVorlesungen;
    private String vorname;
    private String nachname;

    private Student(){
    }

    public Student(String vorname, String nachname) {
        this.besuchteVorlesungen = new Vorlesung[10];
        this.anzahlVorlesungen = 0;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public void print(){
        System.out.print("Student " + vorname + " " + nachname + " hört: ");
        for(int i = 0; i < anzahlVorlesungen; i++) {
            // Für jede VL nach der ersten wollen wir ein Komma nach dem Namen der vorherigen haben
            if(i > 0){
                System.out.print(", ");
            }
            besuchteVorlesungen[i].print();
        }
        System.out.println();
    }

    public Vorlesung[] getBesuchteVorlesungen() {
        return besuchteVorlesungen;
    }

    public void besucheVorlesung(Vorlesung vl) {
        this.besuchteVorlesungen[anzahlVorlesungen] = vl;
        vl.addStudent(this);
        anzahlVorlesungen++;
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
