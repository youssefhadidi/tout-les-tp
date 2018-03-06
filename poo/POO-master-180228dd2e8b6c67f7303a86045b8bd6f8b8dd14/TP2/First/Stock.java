
/**
 * Write a description of class Stock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stock
{
    // instance variables - replace the example below with your own
    private int quantity;

    /**
     * Constructor for objects of class Stock
     */
    public Stock()
    {
        this.quantity = 0;
    }
    
    /**
     * Constructor for objects of class Stock
     * @param quantity (int) initial quantity
     */
    public Stock(int quantity)
    {
        this.quantity = quantity;
    }

    /**  
     * Returns quantity
     * @return (int) Stock's quantity
     */
    public int getQuantity(){
        return this.quantity;
    }
    
    /**
     * Add quantity 
     * @param quantity (int) quantity added
     */
    public void addQuantity(int quantity){
        this.quantity += quantity;
    } 
    
    /**
     * Remove quantity
     * @param quantity (int) quantity removed
     */
    public int removeQuantity(int quantity){
        int tmp;
        if (this.quantity >= quantity){
            this.quantity -= quantity;
            return quantity;
        }
        else{
            tmp = this.quantity;
            this.quantity = 0;
            return tmp;
        }
    }
    
    /**
     * Print quantity 
     * @return (string) Stock's quantity to String
     */
    public String toString(){
        return "the Stock's quantity is "+ this.quantity;
    }
}
