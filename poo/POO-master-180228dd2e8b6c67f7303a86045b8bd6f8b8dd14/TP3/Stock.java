/** This class represents a stock characterized by its quantity
 */
public class Stock {
 
    private int quantity;

    /** creates a  stock with initial quantity = 0
     */
    public Stock() {
	this.quantity = 0;
    }
    /** creates a  stock with given initial quantity
     * @param initialQty the initial quantity for this stock
     */
    public Stock(int initialQty) {
	this.quantity = initialQty;
    }

    /** gives the quantity of this stock
     * @return the quantity of this stock
     */
    public int getQuantity() {
	return this.quantity;
    }

    /** removes elements from this stock. As much required elements as possible are removed from stock.
     *  Quantity never becomes negative.
     * 
     * @param removedQty the quantity of elements to be removed from this stock
     * @return the quantity that has been effectiveely removed from this stock
     */
    public int remove(int removedQty) {
        if (removedQty > this.quantity) {
            removedQty = this.quantity ;
        }
        this.quantity = this.quantity - removedQty ;
        return removedQty ;        
    }

    /** adds some quantity to this stock
     * @param qty the added quantity
     */
    public void add(int qty) {
	this.quantity = this.quantity + qty;
    }
    
    
    public String toString() {
	return "the quantity for this stock is "+this.quantity;
    }
}
