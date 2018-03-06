
/**
 * Write a description of class Switch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Switch
{
    // instance variables - replace the example below with your own
    private Lightbulb light;

    /**
     * Constructor for objects of class Switch
     */
    public Switch(Lightbulb light)
    {
        this.light = light;
    }

    /**
     * Activates object Switch
     */
    public void press(){
        this.light.Switch();
    }
    
    /**
     * Returns associated lightbulb
     * @return (Lightbulb) associated lightbulb
     */
    public String getLightbulb(){
        return this.light.toString();
    }
}
