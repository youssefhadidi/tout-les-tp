package hanoi;
import hanoi.util.Tower;
import hanoi.util.Disc;
/***
 * Hanoi it's a game with discs and towers
 *
 * @author Evrard-Lecluse
 * @version 1.0
*/
public class Hanoi {
	////////////////////////
	// PRIVATE ATTRIBUTES //
	////////////////////////
	private int score;
	private String playerName;
	private boolean isResolved;
	private Tower[] towerList;
	private int nbDiscs;

	//////////////////
	// CONSTRUCTORS //
	//////////////////
	/**
	* Hanoi's Constructor creation of Towers and Dics
	*@param playerName(String) player's name
	*@param nbDiscs(int) nb of discs
	*/
	public Hanoi (String playerName, int nbDiscs){
		this.score = 0;
		this.playerName = playerName;
		this.isResolved = false;
		this.nbDiscs = nbDiscs;
		// DISCS
		Disc[] discList = new Disc[nbDiscs];
		for (int i=0;i<nbDiscs;i++){
			discList[i] = new Disc(i+1);
		}
		// TOURS
		this.towerList = new Tower[3];
		this.towerList[0]=new Tower(nbDiscs);

		this.towerList[1]=new Tower(nbDiscs);

		this.towerList[2]=new Tower(nbDiscs);

		// DISCS -> TOWERS
		for (int j=0;j<nbDiscs;j++){
			towerList[0].putDisc(discList[nbDiscs-1-j]);
		}
	}

	///////////////
	// SELECTORS //
	///////////////
	/**
	* return score's value
	* @return (int) Game's Score
	*/
	public int getScore(){
		return this.score;
	}

	/**
	* return the name of the player
	* @return (String) Player's name
	*/
	public String getPlayerName(){
		return this.playerName;
	}

	/**
	* return TRUE if the game is resolved or FALSE if not
	* @return (boolean) If game's resolved
	*/
	public boolean getIsResolved(){
		return this.isResolved;
	}

	/**
	* return the list of Towers
	* @return (Tower[]) list of Towers
	*/
	public Tower[] getTowerList(){
		return this.towerList;
	}

	/////////////
	// METHODS //
	/////////////
	/**
	* return TRUE if the Object is equals to Object other or FALSE if not
	* @param other (Object) an other Object
	* @return (boolean) If Object is equals to other
	*/
	public boolean equals(Object other){
		if(other instanceof Hanoi){
			Hanoi theOther = (Hanoi) other;
			return (this.playerName == theOther.playerName) && (this.score==theOther.score) && (this.isResolved==theOther.isResolved);
		}
		else {
			return false;
		}
	}

	/**
	* return a String Value of the game
	*/
	public String toString(){
		return "Player's name : "+this.playerName+"\nScore : "+this.score+"\nResolved ? : "+this.isResolved;
	}

	/**
	* Change the disc on top of the tower0 to ther tower1
	* @param tower0 (Tower) Tower where is the Disc
	* @param tower1 (Tower) Tower where the Disc go
	*/
	public void changeDisc(Tower tower0, Tower tower1){
		Disc discToMove = tower0.upDisc();
		tower1.putDisc(discToMove);
		this.score += 1;
		if ( this.towerList[0].getTopDisc() == null && this.towerList[1].getTopDisc() == null ){
			this.isResolved = true;
		}
	}

	/**
	*
	* @param (int) lengthDisc :
	* @param (Tower) Start :
	* @param (Tower) End :
	* @param (Tower) Intermediate :
	*/
	private void _resolveRecursive(int lengthDisc,Tower Start,Tower End,Tower Intermediate){
		if (lengthDisc != 0){
			_resolveRecursive(lengthDisc-1,Start,Intermediate,End);
			this.changeDisc(Start,End);
			_resolveRecursive(lengthDisc-1,Intermediate,End,Start);
		}
	}
	/**
	* Resolve the game
	*/
	public void resolve(){
		this._resolveRecursive(this.getTowerList()[0].getNbDiscs(),this.getTowerList()[0],this.getTowerList()[2],this.getTowerList()[1]);
		this.isResolved = true;
	}

	/**
	* Display the game
	*/
	public void display(){
		int i,j,k,l;
		char space,underscore;
		space = ' ';
		underscore = '_';

		for (j=0;j<3;j++){
			for (i=0;i<this.nbDiscs;i++){
				System.out.print(space);
			}																				// First line
			System.out.print("|");
			for (i=0;i<this.nbDiscs;i++){
				System.out.print(space);
			}
		}

				System.out.println("");
		Disc[] discsT0,discsT1,discsT2;
		discsT0 = this.towerList[0].getDiscs();
		discsT1 = this.towerList[1].getDiscs();
		discsT2 = this.towerList[2].getDiscs();

		for (k=0; k<this.nbDiscs;k++){
			Disc disc0 = discsT0[k];
			Disc disc1 = discsT1[k];
			Disc disc2 = discsT2[k];

			// PREMIERE TOUR
			if ( disc0 != null){
				// SPACE
				for (l=0; l<this.nbDiscs-disc0.getHight(); l++){
					System.out.print(space);
				}
				// UNDERSCORE
				for (l=0; l< disc0.getHight(); l++){
					System.out.print(underscore);
				}
				// PIPE
				System.out.print("|");
				// UNDERSCORE
				for (l=0; l< disc0.getHight(); l++){
					System.out.print(underscore);
				}
				// SPACE
				for (l=0; l<this.nbDiscs-disc0.getHight(); l++){
					System.out.print(space);
				}
			}
			else{
				for (i=0;i<this.nbDiscs;i++){
					System.out.print(space);
				}																				// First line
				System.out.print("|");
				for (i=0;i<this.nbDiscs;i++){
					System.out.print(space);
				}
			}
			// DEUXIEME TOUR
			if ( disc1 != null){
				// SPACE
				for (l=0; l<this.nbDiscs-disc1.getHight(); l++){
					System.out.print(space);
				}
				// UNDERSCORE
				for (l=0; l< disc1.getHight(); l++){
					System.out.print(underscore);
				}
				// PIPE
				System.out.print("|");
				// UNDERSCORE
				for (l=0; l< disc1.getHight(); l++){
					System.out.print(underscore);
				}
				// SPACE
				for (l=0; l<this.nbDiscs-disc1.getHight(); l++){
					System.out.print(space);
				}
			}
			else{
				for (i=0;i<this.nbDiscs;i++){
					System.out.print(space);
				}																				// First line
				System.out.print("|");
				for (i=0;i<this.nbDiscs;i++){
					System.out.print(space);
				}
			}
			// TROISIEME TOUR
			if ( disc2 != null){
				// SPACE
				for (l=0; l<this.nbDiscs-disc2.getHight(); l++){
					System.out.print(space);
				}
				// UNDERSCORE
				for (l=0; l< disc2.getHight(); l++){
					System.out.print(underscore);
				}
				// PIPE
				System.out.print("|");
				// UNDERSCORE
				for (l=0; l< disc2.getHight(); l++){
					System.out.print(underscore);
				}
				// SPACE
				for (l=0; l<this.nbDiscs-disc2.getHight(); l++){
					System.out.print(space);
				}
			}
			else{
				for (i=0;i<this.nbDiscs;i++){
					System.out.print(space);
				}																				// First line
				System.out.print("|");
				for (i=0;i<this.nbDiscs;i++){
					System.out.print(space);
				}
			}
			System.out.println("");
		}
		System.out.println("");
	}

}
