/***
 * Strategy OrderedChoice
 *
 * @author Evrard-Lecluse
 * version 1.0


    DERNIERE MODIF -> 08/03 11:20 Alexis
 */

 package game.util.strategies;
 import game.*;
 import game.util.*;

 public class OrderedChoice implements Strategy{
     public String name = "Ordered Choice";
     private Game.Choice[] choices = {Game.Choice.ROCK,Game.Choice.PAPER,Game.Choice.SCISSORS};
     private int ind=0;

     public Game.Choice use(){
         this.ind++;
         return this.choices[this.ind%3];
     }

     public String getName(){
       return this.name;
     }
 }
