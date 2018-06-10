package collections.ex4_comparator;

import collections.ex3_sortierung.Student;
import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return Integer.parseInt(s2.getMatrikelNr()) - Integer.parseInt(s1.getMatrikelNr());
    }
}
