package collections.containsnoequals;

import collections.ex3_sortierung.Student;
import collections.ex4_comparator.StudentComparator;

import java.util.ArrayList;
import java.util.Iterator;

public class ContainsNoEqualsDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student klaus = new Student("Klaus", "Klausen", "123456");
        list.add(klaus);

        System.out.println(list.contains(klaus));
        System.out.println(list.contains(new Student("Klaus", "Klausen", "123456")));
    }
}
