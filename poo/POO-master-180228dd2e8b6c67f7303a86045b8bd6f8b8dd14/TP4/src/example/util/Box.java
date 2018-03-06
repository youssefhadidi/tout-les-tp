package example.util;

/**
 *  In this simple version boxes have different weights, there is no other distinction
 *
 * @author jc
 * @version 1.0
 */

public class Box {

    /**
     * creates a Box with given weight
     * @param weight weight of the created box
     */
    public Box(int weight) {
        this.weight = weight;
    }

    /** weight of the box*/
    private int weight;

    /**
     * Returns weight of Box object
     *@return (int) weight of Box object
     */
    public int getWeight() {
        return this.weight;
    }
    /**
     * Return details of Box object in string
     *@return (string) details of Box object in string
     */
    public String toString() {
        return "a box of weight "+this.weight;
    }
}
