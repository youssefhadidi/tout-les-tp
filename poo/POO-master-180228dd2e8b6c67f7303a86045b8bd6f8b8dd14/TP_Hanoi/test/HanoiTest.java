import org.junit.*;
import static org.junit.Assert.*;

import hanoi.Hanoi;
import hanoi.util.Tower;
import hanoi.util.Disc;

public class HanoiTest {

    @Test
    public void testHanoiCreation() {
      String name="test";
      int nbDiscs=5;
      Hanoi someHanoi = new Hanoi(name, nbDiscs);
      Hanoi otherHanoi = new Hanoi(name, nbDiscs);
      assertNotNull(someHanoi);
      // tests des selecteurs
      assertEquals(0,someHanoi.getScore());
      assertTrue(someHanoi.getPlayerName().equals(name));
      assertTrue(someHanoi.equals(otherHanoi));
      assertFalse(someHanoi.getIsResolved());
    }

    @Test
    public void getTowerList() {
      String name="test";
      int nbDiscs=5;
      Hanoi someHanoi = new Hanoi(name, nbDiscs);
      Tower tower1,tower2,tower3;
      tower1 = someHanoi.getTowerList()[0];
      tower2 = someHanoi.getTowerList()[1];
      tower3 = someHanoi.getTowerList()[2];
      // test du placement des disques
      assertEquals(nbDiscs,tower1.getNbDiscs());
      assertEquals(0,tower2.getNbDiscs());
      assertEquals(0,tower3.getNbDiscs());
      // test de la taille max des tours
      assertEquals(nbDiscs,tower1.getSize());
      assertEquals(nbDiscs,tower2.getSize());
      assertEquals(nbDiscs,tower3.getSize());
    }

    @Test
    public void changeDisc() {
        String name="test";
        int nbDiscs=5;
        Hanoi someHanoi = new Hanoi(name, nbDiscs);
        Tower tower1,tower2,tower3;
        tower1 = someHanoi.getTowerList()[0];
        tower2 = someHanoi.getTowerList()[1];
        tower3 = someHanoi.getTowerList()[2];
        // test après avoir déplacé le premier disque de gauche sur le centre
        someHanoi.changeDisc(tower1,tower2);
        assertEquals(1,tower2.getTopDisc().getHight());
        assertEquals(2,tower1.getTopDisc().getHight());
    }

    @Test
    public void resolve() {
      String name="test";
      int nbDiscs=5;
      Hanoi someHanoi = new Hanoi(name, nbDiscs);
      Tower tower1,tower2,tower3;
      tower1 = someHanoi.getTowerList()[0];
      tower2 = someHanoi.getTowerList()[1];
      tower3 = someHanoi.getTowerList()[2];
      // test après résolution
      someHanoi.resolve();
      assertTrue(someHanoi.getIsResolved());
      assertNull(tower1.getTopDisc());
      assertNull(tower2.getTopDisc());
      assertEquals(1,tower3.getDiscs()[0].getHight());
    }


    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(HanoiTest.class);
    }

}
