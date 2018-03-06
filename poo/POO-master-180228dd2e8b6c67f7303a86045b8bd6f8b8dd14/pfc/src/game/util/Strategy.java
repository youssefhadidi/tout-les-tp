/***
 * Strategy Interface
 *
 * @author Evrard-Lecluse
 * @version 1.0


    DERNIERE MODIF -> 08/03 11:20 Alexis
*/

package game.util;
import game.Game.Choice;
public interface Strategy {

    public Choice use();
    public String getName();


}
