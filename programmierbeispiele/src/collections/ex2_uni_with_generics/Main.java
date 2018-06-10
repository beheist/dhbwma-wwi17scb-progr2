package ex2_uni_with_generics;

public class Main {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        // Uni anlegen
        Universitaet dhbw = new Universitaet();
        dhbw.setName("DHBW Mannheim");

        // Studenten anlegen
        Student paul = new Student("Paul", "Müller");
        dhbw.addStudent(paul);
        Student lisa = new Student("Lisa", "Engel");
        dhbw.addStudent(lisa);
        Student franz  = new Student("Franz", "Faul");
        dhbw.addStudent(franz);

        // Vorlesungen anlegen
        Vorlesung prog2 = new Vorlesung("Programmierung 2");
        dhbw.addVorlesung(prog2);
        Vorlesung rhetorik = new Vorlesung("Rhetorik");
        dhbw.addVorlesung(rhetorik);
        Vorlesung bilanzierung = new Vorlesung("Bilanzierung");
        dhbw.addVorlesung(bilanzierung);
        Vorlesung einfuehrg = new Vorlesung("Einführung in die WI");
        dhbw.addVorlesung(einfuehrg);

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
