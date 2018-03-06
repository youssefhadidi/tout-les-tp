import org.junit.*;
import static org.junit.Assert.*;

import hanoi.util.Disc;

public class DiscTest {

    @Test
    public void testDiscCreation() {
        Disc someDisc = new Disc(10);
        assertNotNull(someDisc);
        assertEquals(10,someDisc.getHight());
    }

    @Test
    public void isSmaller() {
        Disc someDisc0 = new Disc(10);
        Disc someDisc1 = new Disc(5);
        Disc someDisc2 = new Disc(15);
        // test avec un disque plus grand
        assertFalse(someDisc0.isSmaller(someDisc1));
        // test avec un disque plus petit
        assertTrue(someDisc0.isSmaller(someDisc2));
    }

    @Test
    public void equals() {
        Disc someDisc0 = new Disc(10);
        Disc someDisc1 = new Disc(10);
        Disc someDisc2 = new Disc(15);
        // test avec un disque equivalent
        assertTrue(someDisc0.equals(someDisc1));
        // test avec un disque different
        assertFalse(someDisc0.equals(someDisc2));
    }



    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(DiscTest.class);
    }

}
