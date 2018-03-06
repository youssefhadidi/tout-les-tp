package hanoi.util;
/**
 * Tower is an object of Hanoi's game
 *
 * @author Evrard-Lecluse
 * @version 1.0
*/

public class Tower {
	////////////////////////
	// PRIVATE ATTRIBUTES //
	////////////////////////
	private int nbDiscs;
	private int size;
	private Disc[] discs;
	public String name;

	//////////////////
	// CONSTRUCTORS //
	//////////////////
	/**
	* Tower's constructor creation
	*/
	public Tower (int size){
		this.nbDiscs = 0;
		this.size = size;
		this.discs = new Disc[size];
		for (int i=0;i<size;i++){
			this.discs[i]=null;
		}
	}

	///////////////
	// SELECTORS //
	///////////////
	/**
	* return the number of Discs in the Tower object
	* @return (int) number of Discs
	*/
	public int getNbDiscs(){
		return this.nbDiscs;
	}


	/**
	* return the size of Discs in the Tower object
	* @return (int) size of Tower
	*/
	public int getSize(){
		return this.size;
	}

	/**
	* return all the Discs of the Tower object
	* @return (Disc[]) Discs of the Tower : {top disc, disc1, ..., last disc}
	*/
	public Disc[] getDiscs(){
		return this.discs;
	}

	/////////////
	// METHODS //
	/////////////
	/**
	* return the Disc at the top of the Tower object
	* @return (Disc) the Discs at the top
	*/
	public Disc getTopDisc(){
		int i;
		if (this.nbDiscs > 0){
			for (i=this.discs.length-1;this.discs[i]!=null;i--){
			}
			return this.discs[i+1];
		}else{
			return null;
		}
	}

	/**
	* return TRUE if the Object is equals to Object other or FALSE if not
	* @param other (Object) an other Object
	* @return (boolean) If Object is equals to other
	*/
	public boolean equals(Object other){
		int i;
		if(other instanceof Tower){
			Tower theOther = (Tower) other;
			return (this.size == theOther.getSize()) && (this.nbDiscs == theOther.getNbDiscs());
		}
		else {
			return false;
		}
	}

	/**
	* remove the Disc at the top of the Tower object and return it, null if there is no disc
	* @return (Disc) Disc Object upped, null if there is no disc
	*/
	public Disc upDisc(){
		if(this.nbDiscs > 0){
			this.nbDiscs--;
			int i;
			for (i=0;this.discs[i]==null;i++){}
			Disc topDisc = this.discs[i];
			this.discs[i] = null;
			return topDisc;
		}else{
			return null;
		}
	}

	/**
	* put the Disc at the top of the Tower object
	* @param (Disc) a Disc Object
	*/
	public void putDisc(Disc disc){
		if (this.nbDiscs == 0){
			this.discs[(this.size)-1] = disc;
		}
		else{
			if (this.getTopDisc().getHight()>disc.getHight()){
				int i;
				for (i=0;this.discs[i]==null;i++){}
				this.discs[i-1] = disc;
			}
		}
		this.nbDiscs++;
	}

	public String toString(){
		String res="";
		int i;
		for (i=0;i<this.size;i++){
			if (this.discs[i] == null){
				res += "    ";
			}else{
				res += ""+this.discs[i].getHight();
			}
		}
		return res;
	}

}
