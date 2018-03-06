package hanoi;
import hanoi.util.Tower;
import hanoi.util.Disc;
import io.HanoiInput;
/***
 * Hanoi it's a game with discs and towers
 *
 * @author Evrard-Lecluse
 * @version 1.0
*/

public class HanoiMain {

	public HanoiMain(){}

	public static void main(String[] args) {
		Hanoi game = new Hanoi(args[0], Integer.parseInt(args[1]));
		game.display();
		Hanoi gameAnnex = new Hanoi(args[0], Integer.parseInt(args[1]));
		gameAnnex.resolve();
		HanoiInput hanoiInput = new HanoiInput();
		while (!game.getIsResolved()){
			hanoiInput.readInput();
			game.changeDisc(game.getTowerList()[hanoiInput.getFrom()],game.getTowerList()[hanoiInput.getTo()]);
			game.display();
		}
		System.out.println("Your score -> "+game.getScore());
		System.out.println("Best possible score -> "+gameAnnex.getScore());
	}
}
