import org.junit.*;
import static org.junit.Assert.*;

import game.*;
import game.util.*;

public class TestGame{

	@Test
	public void testCreationGame(){
		Player player1 = new Player("player1");
		Player player2 = new Player("player2");
		int nbTurnsMax = 5;
		Game someGame = new Game(player1, player2,nbTurnsMax);
		assertEquals(player1,someGame.getPlayer1());
		assertEquals(player2,someGame.getPlayer2());
		assertEquals(0,someGame.getNbTurns());
		assertEquals(nbTurnsMax,someGame.getNbTurnsMax());
	}
	public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(TestGame.class);
   }
}
