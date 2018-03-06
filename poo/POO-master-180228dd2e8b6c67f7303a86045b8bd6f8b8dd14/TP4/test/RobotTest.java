import org.junit.*;
import static org.junit.Assert.*;

import example.Robot;
import example.util.Box;
import example.util.ConveyerBelt;

public class RobotTest {

    @Test
    public void testRobotCreation() {
        Robot someRobot = new Robot();
        assertNotNull(someRobot);
        assertNull(someRobot.getCarriedBox());
    }

    @Test
    public void take() {
        Robot someRobot = new Robot();
        Box box1 = new Box(10);
        Box box2 = new Box(20);
        /* Le robot ne porte rien */
        someRobot.take(box1);
        assertEquals(box1,someRobot.getCarriedBox());
        /* Le robot porte déjà une boite */
        someRobot.take(box2);
        assertEquals(box1,someRobot.getCarriedBox());
	  }

    @Test
    public void carryBox() {
        Robot someRobot = new Robot();
        Box box1 = new Box(10);
        /* Le robot ne porte rien */
        assertFalse(someRobot.carryBox());
        someRobot.take(box1);
        /* Le robot porte une boite */
        assertTrue(someRobot.carryBox());
    }

    @Test
    public void putOn() {
        Robot someRobot = new Robot();
        ConveyerBelt conveyerBelt = new ConveyerBelt(15);
        Box box1 = new Box(10);
        Box box2 = new Box(20);
        someRobot.take(box1);
        someRobot.putOn(conveyerBelt);
        /* le tapis accepte la box */
        assertFalse(someRobot.carryBox());
        someRobot.take(box2);
        someRobot.putOn(conveyerBelt);
        /* le tapis n'accepte pas la box */
        assertTrue(someRobot.carryBox());
  	}

// ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(RobotTest.class);
    }

}
