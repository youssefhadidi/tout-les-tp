/***
 * Player Class
 * 
 * @author Evrard-Lecluse
 * @version 1.0
 
 
    DERNIERE MODIF -> 08/03 11:20 Alexis
*/

package game.util;
import game.util.strategies.*;
public class Player{
	
	
	////////////////
	// ATTRIBUTES //
	////////////////
	
	private String name;
	private int score;
	private Strategy strategy;
	
	/////////////////
	// CONSTRUCTOR //
	/////////////////
	
	/*
	 * The Constructor of player with a name
	 * @param name (String) the player's name
	 * @param strategy Strategy the player's strategy
	 */
	public Player(String name,Strategy strategy){
		this.name = name;
		this.strategy = strategy;
		this.score = 0;
	}
	
	///////////////
	// SELECTORS //
	///////////////
	
	/*
	 * get the player's name
	 * @return (String) player's name
	 */
	public String getName(){
		return this.name;
	}
	
	
	/*
	 * get the player's score
	 * @return (int) player's score
	 */
	public int getScore(){
		return this.score;
	}
	
	/*
	 * get the player's strategy
	 * @return (Strategy) player's strategy
	 */
	public Strategy getStrategy(){
		return this.strategy;
	}
	
	/////////////
	// METHODS //
	/////////////
	
	/*
	 * add a score to the Player's score
	 * @param score (int) score added
	 */
	 public void addScore(int score){
	     this.score = this.score + score;
	 }
	
}
