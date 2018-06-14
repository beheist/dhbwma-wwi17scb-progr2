package collections.listsorting;

import collections.ex3_sortierung.Student;
import collections.ex4_comparator.StudentComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListSortingDemo {
    public static void main(String[] args) {
        Student klaus = new Student("Klaus", "Klausen", "123456");
        Student peter = new Student("Peter", "Petersen", "456789");
        Student helga = new Student("Helga", "Hansen", "234567");

        ArrayList<Student> list = new ArrayList<>();

        list.add(klaus);
        list.add(peter);
        list.add(helga);

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            s.print();
        }

        System.out.println();

        // The statements below are equivalent
        list.sort(new StudentComparator());
//        Collections.sort(list, new StudentComparator());

        it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            s.print();
        }
    }
}
