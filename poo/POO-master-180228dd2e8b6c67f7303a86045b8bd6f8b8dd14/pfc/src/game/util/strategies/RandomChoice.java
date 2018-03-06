/***
 * Strategy RandomChoice
 *
 * @author Evrard-Lecluse
 * version 1.0


    DERNIERE MODIF -> 08/03 11:20 Alexis
 */

 package game.util.strategies;
 import game.*;
 import game.util.*;
 import java.util.Random;

 public class RandomChoice implements Strategy{
     public String name = "Random Choice";
     private  Game.Choice[] choices = {Game.Choice.ROCK,Game.Choice.PAPER,Game.Choice.SCISSORS};

     public Game.Choice use(){
         float ind = new Random().nextFloat();
         if (ind<=0.33){
             return this.choices[0];
         }
         else if (ind>0.33 && ind <= 0.66){
             return this.choices[1];
         }
         else{
             return this.choices[2];
         }
     }

     public String getName(){
       return this.name;
     }
 }
