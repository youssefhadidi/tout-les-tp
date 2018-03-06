
/**
 * Write a description of class Lightbulb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lightbulb
{
    // instance variables - replace the example below with your own
    private String color;
    private int power;
    private boolean turnOn;

    /**
     * Constructor for objects of class Lightbulb
     */
    public Lightbulb(String color, int power)
    {
        this.color = color;
        this.power = power;
        this.turnOn = false;
    }
    
    /**
     * Returns color of object Lightbulb
     * @return (String) color of object Lightbulb
     */
    public String getColor(){
        return this.color;
    }
    
    
    /**
     * Returns power of object Lightbulb
     * @return (int) power of object Lightbulb
     */
    public int getPower(){
        return this.power;
    }
    
    
    /**
     * Returns true if object Lightbulb is turned on, else false
     * @return (boolean) true if object Lightbulb is turned on, else false
     */
    public boolean isOn(){
        return this.turnOn;
    }
    
    
    /**
     * turns off object Lightbulb if it's turned on, turns on it else
     */
    public void Switch(){
        this.turnOn = !this.turnOn;
    }
    
    /**
     * Returns details of object Lightbulb
     * @return (String) details of object Lightbulb
     */
    public String toString(){
        if (this.turnOn){
            return "Lightbulb "+this.color+" of "+this.power+"Watts is turned on";
        }
        else{
            return "Lightbulb "+this.color+" of "+this.power+"Watts is turned off";
        }
    }
}
