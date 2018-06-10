package collections.basics;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList liste = new ArrayList();
        liste.add("Otto");
        liste.add("Ludwig");
        liste.add("Helmut");
        liste.add(2, "Paul");
        liste.set(1, "Überschreibt den Ludwig");

        System.out.println(liste.contains("Otto"));
        System.out.println(liste.indexOf("Ludwig"));
        System.out.println(liste.get(3));
        System.out.println(liste.size());

        Iterator i = liste.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        liste.clear();
        System.out.println(liste.size());
    }
}
