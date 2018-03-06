package rental;
import java.util.*;
/**
 * An InterCriterion performs the intersection of criterions. It is satisfied if each of its criterion is satisfied.
*/
public class InterCriterion implements Criterion {

    private List<Criterion> allCriterions;

    /** creates an InterCriterion with no criterion */
    public InterCriterion() {
      this.allCriterions = new ArrayList<Criterion>();
    }

    /** adds a new criterion
    * @param c the added criterion
    */
    public void addCriterion(Criterion c) {
      this.allCriterions.add(c);
    }

    /** This is satisfied if each of its criterion is satisfied.
     * @see Criterion#isSatisfiedBy(Vehicle) */
    public boolean isSatisfiedBy(Vehicle v) {
      boolean ok = true;
      int i;
      for (Criterion c : this.allCriterions){
        if (!c.isSatisfiedBy(v)){
          ok = false;
        }
      }
      return ok;
    }
}
