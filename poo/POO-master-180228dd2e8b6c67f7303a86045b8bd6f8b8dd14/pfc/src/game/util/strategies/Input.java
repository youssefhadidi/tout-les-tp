/***
 * Strategy Input Choice
 *
 * @author Evrard-Lecluse
 * version 1.0


    DERNIERE MODIF -> 08/03 11:20 Alexis
 */

 package game.util.strategies;
 import game.*;
 import game.util.*;
 import java.util.Scanner;

 public class Input implements Strategy{
     public String name = "Input";
     private int ind = 0;

     public Game.Choice use(){
         Scanner reader = new Scanner(System.in);
         System.out.println("Enter choice : 0 -> Rock  |  1 -> Paper  |  2 -> Scissors ");
         try{
		int choice = reader.nextInt();
	 
         	if (choice==0){
           	  return Game.Choice.ROCK;
        	 }
        	 else if (choice==1){
         	    return Game.Choice.PAPER;
         	}
         	else if (choice==2){
         	    return Game.Choice.SCISSORS;
         	}
         	else{
         	    return use();
         	}
	}catch(java.util.InputMismatchException e){
	     return use();
	}     
}

     public String getName(){
       return this.name;
     }
 }
