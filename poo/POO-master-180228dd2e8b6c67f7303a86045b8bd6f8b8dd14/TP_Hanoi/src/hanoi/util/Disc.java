package hanoi.util;
/**
 * Disc have a hight
 * @author : Evrard - Lecluse
 * @version 1.0
*/


public class Disc {

	////////////////////////
	// PRIVATE ATTRIBUTES //
	////////////////////////
	private int hight;

	//////////////////
	// CONSTRUCTORS //
	//////////////////
	/**
	* Disc's Constructor creation
	*/
	public Disc (int hight){
		this.hight = hight;
	}

	///////////////
	// SELECTORS //
	///////////////
	/**
	 * return the hight of this disc
	 * @return (int) hight of this disc
	*/
	public int getHight(){
		return this.hight;
	}

	/////////////
	// METHODS //
	/////////////
	/**
	 * return true if this disc is smaller than an other
	 * @param (Disc other) an other Disc
	 * @return (boolean) true if this disc is smaller than an other, else false
	*/
	public boolean isSmaller(Disc other){
		return this.hight < other.hight;

	}

	/**
	 * return true if this disc is egal to an other object
	 * @param (Object) object compared with this disc
	 * @return true if other is a disc with the same hight and the same tower as this disc
	*/
	public boolean equals(Object other){
		if(other instanceof Disc){
			Disc theOther = (Disc) other;
			return (this.hight == theOther.hight);
		}
		else {
			return false;
		}
	}

	public String toString(){
		return ""+this.getHight();
	}

}
