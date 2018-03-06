
/**
 * Write a description of class LightString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LightString
{
    // instance variables - replace the example below with your own
    private Lightbulb[] lights;
    private int nbLights;
    private int maxLights;

    /**
     * Constructor for objects of class LightString
     */
    public LightString(int maxLights)
    {
        this.nbLights = 0;
        this.maxLights = maxLights;
        this.lights = new Lightbulb[this.maxLights];
        int i;
        for (i=0;i<maxLights;i++){
            lights[i]=new Lightbulb("white",1);
        }
    }

    /**
     * Adds a lightbulb
     * @param light (Lightbulb) added lightbulb
     */
    public void addLight(Lightbulb light){
        this.lights [this.nbLights] = light;
        this.nbLights ++;
    }
    
    /**
     * Returns the nth light
     * @param n (int) index of returned light
     * @return (Lightbulb) nth light
     */
    public Lightbulb getLight(int n){
        if (n>= this.maxLights){ return null; }
        return lights[n];
    }
    
    /**
     * Replaces a lightbulb
     * @param i (int) index of changed light
     * @param light (Lightbulb) new light
     */
    public void changeLight(int i, Lightbulb light){
        this.lights[i] = light;
    }
    
    /**
     * switches all lights
     */
    public void Switch(){
        int i;
        for (i=0;i<this.maxLights;i++){
            this.lights[i].Switch();
        }
    }
    
    /**
     * Returns total power
     * @return (int) total power
     */
    public int getTotalPower(){
        if (!this.lights[0].isOn()){return 0;}
        int i,total=0;
        for (i=0;i<this.maxLights;i++){
            total += this.lights[i].getPower();
        }
        return total;
    }
}
