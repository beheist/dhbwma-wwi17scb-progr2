package testing.ex1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

public class UniversitaetTest {
    @Test
    public void nameShouldBeSetCorrectly(){
        Universitaet uni = new Universitaet();
        uni.setName("DHBW");
        assertEquals("Universitaet's name should be 'DHBW'", "DHBW", uni.getName());
    }

    @Test
    public void lecturesShouldBeAddedToUniversity(){
        Universitaet uni = new Universitaet();
        Vorlesung vl1 = new Vorlesung("Foo");
        uni.addVorlesung(vl1);
        List<Vorlesung> vls = uni.getVorlesungen();

        assertEquals("vls Length should be 1", 1, vls.size());
        assertEquals("Vorlesung should be saved", vl1, vls.get(0));
    }
}