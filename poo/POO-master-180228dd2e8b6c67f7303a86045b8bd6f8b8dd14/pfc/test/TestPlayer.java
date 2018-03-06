import org.junit.*;
import static org.junit.Assert.*;

import game.util.*;

public class TestPlayer{
	
	@Test
	public void testCreationPlayer(){
		String namePlayer = new String("TestPlayer");
		Player somePlayer = new Player(namePlayer);
		assertTrue(namePlayer.equals(somePlayer.getName()));
		assertEquals(0,somePlayer.getScore());
	}
	public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(TestPlayer.class);
   }
}
