package objects.various;

public class RefVar {
    public static void main(String[] args) {
        Buch book1 = new Buch("Die Bibel");
        Buch book2;
        // Wir kopieren die Referenz auf das Buch-Objekt in die Variable c
        // Jetzt verweisen zwei Variablen auf das gleiche Objekt!
        book2 = book1;
        book1.setTitel("Das kommunistische Manifest");
        System.out.println(book1.getTitel());
        System.out.println(book2.getTitel());
    }
}

