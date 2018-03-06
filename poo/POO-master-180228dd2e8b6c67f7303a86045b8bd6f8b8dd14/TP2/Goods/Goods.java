
/**
 * Write a description of class Goods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goods
{
    // instance variables - replace the example below with your own
    private double value;
    private String name;

    /**
     * Constructor for objects of class Goods
     * @param name (String) initial name
     */
    public Goods(String name)
    {
        this.value = 0;
        this.name = name;
    }
    
    /**
     * Constructor for objects of class Goods
     * @param name (String) initial name
     * @param value (double) initial value
     */
    public Goods (String name, double value){
        this.name = name;
        this.value = value;
    }

    /**
     * Returns value of object Goods
     * @return (double) value of object Goods
     */
    public double getValue(){
        return this.value;
    }
    
    /**
     * Set value of object Goods
     * @param value (double) new value
     */
    public void setValue(double value){
        this.value = value;
    }
    
    /**
     * Returns name of object Goods
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Return attributes to String
     * @return (String) attributes to String
     */
    public String toString(){
        return "the goods "+this.name+" costs "+this.value;
    }
    
    /**
     * Return TTC value of object Goods
     * @return (double) TTC value of object Goods
     */
    public double getTTCValue(){
        return this.value + this.value*19.6/100;
    }
}
