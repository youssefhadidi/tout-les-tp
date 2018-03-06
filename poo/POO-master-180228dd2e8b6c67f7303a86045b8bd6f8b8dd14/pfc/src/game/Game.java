/***
 * Game Class
 *
 * @author Evrard-Lecluse
 * @version 1.0


    DERNIERE MODIF -> 08/03 11:20 Alexis
*/

package game;
import game.util.*;


public class Game{

  public static enum Choice{

    ROCK,
    SCISSORS,
    PAPER;
  }

	////////////////
	// ATTRIBUTES //
	////////////////
	private Player player1;
	private Player player2;
	private int nbTurns;
	private int nbTurnsMax;

	/////////////////
	// CONSTRUCTOR //
	/////////////////

	/**
	 * Game's Constructor creation
	 * @param player1 (Player) player 1
	 * @param player2 (Player) player 2
	 */
	public Game(Player player1, Player player2, int nbTurnsMax){
		this.player1 = player1;
		this.player2 = player2;
		this.nbTurns = 0;
		this.nbTurnsMax = nbTurnsMax;
	}


	///////////////
	// SELECTORS //
	///////////////

	/**
	 * Get the number of turns
	 * @return nbTurns (int) number of turns
	 */
	public int getNbTurns(){
		return this.nbTurns;
	}

	/**
	 * Get the final number of turns
	 * @return nbTurns (int) final number of turns
	 */
	public int getNbTurnsMax(){
		return this.nbTurnsMax;
	}

	/**
	 * Get the first player
	 * @return player 1 (Player) the first player
	 */
	public Player getPlayer1(){
		return this.player1;
	}

	/**
	 * Get the second player
	 * @return player2 (Player) the second player
	 */
	public Player getPlayer2(){
		return this.player2;
	}


	/////////////
	// METHODS //
	/////////////

  /**
   * Evals a round comparing choices
   *@param choice1 (Choice)
   *@param choice2 (Choice)
   *@return (int) 1 if choice1 wins vs choice2
   *             -1 if choice2 wins vs choice1
   *              0 else
   */
   public int evals(Choice choice1, Choice choice2){
     if (choice1 == Choice.PAPER){
       if(choice2 == Choice.SCISSORS){
         // PAPER VS SCISSORS
         return -1;
       }else if(choice2 == Choice.ROCK){
         // PAPER VS ROCK
         return 1;
       }else{
         // PAPER VS PAPER
         return 0;
       }
     }else if (choice1 == Choice.SCISSORS){
       if(choice2 == Choice.PAPER){
         // SCISSORS VS PAPER
         return 1;
       }else if(choice2 == Choice.ROCK){
         // SCISSORS VS ROCK
         return -1;
       }else{
         // SCISSORS VS SCISSORS
         return 0;
       }

     }else if (choice1 == Choice.ROCK){
       if(choice2 == Choice.SCISSORS){
         // ROCK VS SCISSORS
         return 1;
       }else if(choice2 == Choice.PAPER){
         // ROCK VS PAPER
         return -1;
       }else{
         // ROCK VS ROCK
         return 0;
       }

     }
     return -2;
   }

	/**
	 * Play one round of Rock Paper Scissors game
	 */
	public void playOneRound(){
    Choice choiceP1 = this.getPlayer1().getStrategy().use();
    Choice choiceP2 = this.getPlayer2().getStrategy().use();
    System.out.format("\n\t\t%s VS %s\n",choiceP1,choiceP2);
    this.getPlayer1().addScore(this.evals(choiceP1,choiceP2));
    this.getPlayer2().addScore(this.evals(choiceP2,choiceP1));
    this.nbTurns++;
    if(this.evals(choiceP1,choiceP2) ==1){
      System.out.println("\n\t\t\tWIN\n");
    }else if(this.evals(choiceP1,choiceP2) ==-1){
      System.out.println("\n\t\t\tLOSE\n");
    }else{
        System.out.println("\n\t\t\tSPARE\n");
    }
  }

	/*
	 * Play all rounds of Rock Paper Scissors game
	 */
	 public void playGame(){
	     while (this.nbTurns < this.nbTurnsMax){
	         this.playOneRound();
	     }
	     System.out.format("%s score: %d\n%s score: %d\n",this.player1.getName(),this.player1.getScore(),this.player2.getName(),this.player2.getScore());
       if(player1.getScore()>player2.getScore()){
         System.out.format("Winner-> %s \n",player1.getName());
       }else if(player1.getScore()<player2.getScore()){
         System.out.format("Winner-> %s \n",player2.getName());
       }else{
         System.out.format("Winner-> No Winner \n");
       }
	 }
}
