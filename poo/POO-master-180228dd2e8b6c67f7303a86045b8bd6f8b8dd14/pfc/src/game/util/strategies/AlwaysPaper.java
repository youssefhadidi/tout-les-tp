/***
 * Strategy AlwaysPaper
 *
 * @author Evrard-Lecluse
 * @version 1.0


    DERNIERE MODIF -> 08/03 11:20 Alexis
*/

package game.util.strategies;
import game.*;
import game.util.*;

public class AlwaysPaper implements Strategy{
    public String name = "Always Paper";

    public Game.Choice use(){
        return Game.Choice.PAPER;
    }

    public String getName(){
      return this.name;
    }

}
