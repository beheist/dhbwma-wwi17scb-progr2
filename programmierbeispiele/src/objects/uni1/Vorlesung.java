package objects.uni1;

public class Vorlesung {
    private String name;
    private Student[] students;
    private int anzahlStudenten;

    public Vorlesung(String name) {
        this.students = new Student[30];
        this.name = name;
    }

    public void print() {
        System.out.print("\"" + name + "\"");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students[anzahlStudenten] = student;
        anzahlStudenten++;
    }
}
