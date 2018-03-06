/***
 * Strategy AlwaysRock
 *
 * @author Evrard-Lecluse
 * @version 1.0


    DERNIERE MODIF -> 08/03 11:20 Alexis
*/

package game.util.strategies;
import game.*;
import game.util.*;

public class AlwaysRock implements Strategy{
    public String name = "Always Rock";

    public Game.Choice use(){
        return Game.Choice.ROCK;
    }

    public String getName(){
      return this.name;
    }

}
