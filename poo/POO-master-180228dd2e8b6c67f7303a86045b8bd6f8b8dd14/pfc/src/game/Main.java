/***
 * Main Class
 *
 * @author Evrard-Lecluse
 * @version 1.0


    DERNIERE MODIF -> 08/03 11:20 Alexis
*/

package game;
import game.util.*;
import game.util.strategies.*;

public class Main{

	public Main(){}

	public static void main (String[] args){
			Strategy strategyP2;
			switch (args[1]){
				case "0":
					strategyP2 = new AlwaysRock();
					break;
				case "1":
					strategyP2 = new OrderedChoice();
					break;
				case "2":
					strategyP2 = new RandomChoice();
					break;
				case "3":
					strategyP2 = new AlwaysPaper();
					break;
				default:
					strategyP2 = new Input();
			}


		  Player player1 = new Player(args[0], new Input());
			Player player2 = new Player("CPU", strategyP2);

	    Game game = new Game(player1, player2, Integer.parseInt(args[2]));
			System.out.format("\t----- %s -----\n",strategyP2.getName());
			game.playGame();
	}
}
