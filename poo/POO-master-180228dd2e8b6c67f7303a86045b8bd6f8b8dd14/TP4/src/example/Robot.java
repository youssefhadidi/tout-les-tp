package example;
import example.util.Box;
import example.util.ConveyerBelt;
/**
 * A robot can carry one box at a time and put it on a coveyer belt
 *
 * @author jc
 * @version 1.0
 */

public class Robot {

    // les attributs de la classe Robot
    /** the box carried by robot  */
    private Box carriedBox;
    /**
     * creates a robot
     */
    public Robot() {
	     this.carriedBox = null;
    }


    // les methodes de la classe Robot
    /**
     * this robot takes a box if it was not allready carrying one, else nothing happens	 * @param box the carried box
     *@param box (Box) box to take
     */
    public void take(Box box) {
	     if (!this.carryBox()) { // already carrying a box ?
	        this.carriedBox = box;
	     }
    }

    /**
     * this robot puts the carried box on the belt
     *
     * @param belt (ConveyerBelt) the bel on which box is put
     *
     */
      public void putOn(ConveyerBelt belt) {
      	if (this.carryBox() && belt.accept(carriedBox) && !belt.isFull()) {
      	    // put box on belt
      	    belt.receive(carriedBox);
      	    // no more box is carried
      	    this.carriedBox = null;
      	} else {
      	    if (!this.carryBox()) {
      		      System.out.println("no box carried");
      	    } else if (belt.isFull()) {
      		      System.out.println("belt is full");
      	    } else {
      		      System.out.println("box weights too much for this belt : " + this.carriedBox.getWeight() + " against "
      				   + belt.getMaxWeight() + " max");
      	    }
      	}
    }

    /**
     * returns true if this robot is carrying a box, false else
     * @return (boolean) true if this robot is carrying a box, false else
     */
    public boolean carryBox() {
	     return this.carriedBox != null;
    }

    /** returns the carried box
     *@return (Box) the carried box
     */
    public Box getCarriedBox() {
        return this.carriedBox;
    }

    public static void main(String[] args) {

        System.out.println("beginning of main from robot.Robot");

        Robot robbie = new Robot();
        ConveyerBelt belt1 = new ConveyerBelt(50);
        ConveyerBelt belt2 = new ConveyerBelt(150);
        Box box10 = new Box(10);
        Box box15 = new Box(15);
        Box box100 = new Box(100);
        Box box60 = new Box(60);

        robbie.take(box10);
        robbie.putOn(belt1);
        robbie.take(box15);
        robbie.putOn(belt1);
        robbie.take(box100);
        robbie.putOn(belt2);

        belt1.display();

        System.out.println("end of main from robot.Robot");
    }

}
