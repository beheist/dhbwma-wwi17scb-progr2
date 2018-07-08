package testing.ex1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class StudentTest {
    @Test
    public void studentShouldOnlyBeAbleToVisitALectureOnce(){
        Vorlesung vl = new Vorlesung("Foo");
        Student s = new Student("Paul", "Meier");

        s.besucheVorlesung(vl);
        s.besucheVorlesung(vl);

        assertEquals("Student should only have 1 VL", 1, s.getBesuchteVorlesungen().size());
    }

    @Test
    public void vorlesungenStringShouldNotHaveATrailingCommaAndSpace(){
        Vorlesung vl1 = new Vorlesung("Foo");
        Vorlesung vl2 = new Vorlesung("Bar");
        Student s = new Student("Paul", "Meier");

        s.besucheVorlesung(vl1);
        s.besucheVorlesung(vl2);

        String vlString = s.getVorlesungenString();

        assertNotEquals("no trailing comma and space in last position", ", ", vlString.substring(vlString.length() - 2));
    }
}