package testing.ex1;

import java.util.ArrayList;
import java.util.List;

public class Vorlesung {
    private String name;
    private ArrayList students;

    public Vorlesung(String name) {
        students = new ArrayList();
        this.name = name;
    }

    public String toString() {
        return"\"" + name + "\"";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getStudents() {
        return students;
    }

    public boolean addStudent(Student s) {
        return students.add(s);
    }
}
