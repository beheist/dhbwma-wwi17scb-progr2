package collections.ex3_sortierung;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionsSortDemo {
    public static void main(String[] args) {
        Student klaus = new Student("Klaus", "Klausen", "123456");
        Student peter = new Student("Peter", "Petersen", "456789");
        Student helga = new Student("Helga", "Hansen", "234567");
        Student fritz = new Student("Fritz", "Fritzlar", "789123");
        Student paula = new Student("Paula", "Paulsen", "123789");

        TreeSet<Student> set = new TreeSet<>();

        set.add(klaus);
        set.add(peter);
        set.add(helga);
        set.add(fritz);
        set.add(paula);

        Iterator<Student> it = set.iterator();

        while(it.hasNext()) {
            Student s = it.next();
            s.print();
        }
    }
}
