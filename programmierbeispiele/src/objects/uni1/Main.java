package objects.uni1;

public class Main {
    public static void main(String[] args) {
        // Studenten anlegen
        Student paul = new Student("Paul", "Müller");
        Student lisa = new Student("Lisa", "Engel");
        Student franz  = new Student("Franz", "Faul");
        Student[] studenten = new Student[3];
        studenten[0] = paul;
        studenten[1] = lisa;
        studenten[2] = franz;

        // Uni anlegen
        Universitaet dhbw = new Universitaet();
        dhbw.setName("DHBW Mannheim");
        dhbw.setStudenten(studenten);

        // Vorlesungen anlegen
        Vorlesung prog2 = new Vorlesung("Programmierung 2");
        Vorlesung rhetorik = new Vorlesung("Rhetorik");
        Vorlesung bilanzierung = new Vorlesung("Bilanzierung");
        Vorlesung einfuehrg = new Vorlesung("Einführung in die WI");
        Vorlesung[] vorlesungen = new Vorlesung[4];
        vorlesungen[0] = prog2;
        vorlesungen[1] = rhetorik;
        vorlesungen[2] = bilanzierung;
        vorlesungen[3] = einfuehrg;
        dhbw.setVorlesungen(vorlesungen);

        // Studenten in die VL schicken
        paul.besucheVorlesung(prog2);
        paul.besucheVorlesung(rhetorik);
        lisa.besucheVorlesung(rhetorik);
        lisa.besucheVorlesung(bilanzierung);
        franz.besucheVorlesung(einfuehrg);

        // Am ende alles ausgeben
        dhbw.print();
    }
}
