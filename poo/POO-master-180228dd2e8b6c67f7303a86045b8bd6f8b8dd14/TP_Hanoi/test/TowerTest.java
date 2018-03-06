import org.junit.*;
import static org.junit.Assert.*;

import hanoi.util.Tower;
import hanoi.util.Disc;

public class TowerTest {

    @Test
    public void testTowerCreation() {
        Tower someTower = new Tower(10);
        assertNotNull(someTower);
        assertEquals(0,someTower.getNbDiscs());
        assertEquals(10,someTower.getSize());
    }

    @Test
    public void getTopDisc() {
        Tower someTower = new Tower(10);
        Disc someDisc = new Disc(10);
        // test sans disque
        assertNull(someTower.getTopDisc());
        // test avec un disque
        someTower.putDisc(someDisc);
        assertEquals(someDisc,someTower.getTopDisc());
    }

    @Test
    public void putDisc() {
        Disc someDisc0 = new Disc(10);
        Disc someDisc1 = new Disc(5);
        Disc someDisc2 = new Disc(7);
        Tower someTower = new Tower(5);
        // test avec une tour vide
        someTower.putDisc(someDisc0);
        assertEquals(someDisc0,someTower.getTopDisc());
        // test avec un nouveau disque plus petit
        someTower.putDisc(someDisc1);
        assertEquals(someDisc1,someTower.getTopDisc());
        //test avec un nouveau disque plus grand
        someTower.putDisc(someDisc2);
        assertEquals(someDisc1,someTower.getTopDisc());
    }

    @Test
    public void upDisc() {
        Tower someTower = new Tower(10);
        Disc someDisc = new Disc(10);
        // test avec une tour vide
        assertNull(someTower.upDisc());
        // test avec une tour non vide
        someTower.putDisc(someDisc);
        assertEquals(someDisc, someTower.upDisc());
        // verification de la suppression du disque
        assertNull(someTower.getTopDisc());
    }

    @Test
    public void equals() {
        Disc someDisc = new Disc(10);
        Tower someTower0 = new Tower(10);
        Tower someTower1 = new Tower(10);
        // test avec une tour equivalente
        assertTrue(someTower0.equals(someTower1));
        // test avec une tour differente
        someTower0.putDisc(someDisc);
        assertFalse(someTower0.equals(someTower1));
        // test avec une tour équivalente et un meme disque
        someTower1.putDisc(someDisc);
        assertTrue(someTower0.equals(someTower1));
    }


    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(TowerTest.class);
    }

}
