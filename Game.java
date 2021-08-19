/**
* Title: Game
* description: Main Game file
* date: 2021-04-30
* @author Andrew Mackay
* @version 1
* @copyright 2020 Andrew Mackay
*/

/**
* DOCUMENTATION...
*/
/**
*
* Game.java
*
* Purpose and Description: 
* Create a player class to interact with Game,Inventory,World map,and Queen.
*
*
* Compiling and running instructions<
* Required: cd\desktop\java\Assignment 4\javac Game.java
* Compile:  cd\desktop\java\Assignment 4\java Game
* Run:      ....
*
*/
/**
*
* Classes:
*
* Your Class Name: Game.
* describe your class 
* Constructors:
* Game()- This is the default constructor for Game object.
* 
* Methods:
* getName() - This is to return class member variable name

* outputLevel
* Battle(Alice p, Queen q)
Instance Variables
* ......
*
* Another Class Name:
* ......
* Another Class Constructors:
* Another Class Methods:
* etc.
*/


import textio.TextIO;	//this is to use textio.
//import java.util.concurrent.TimeUnit;	//This is so there is a delay for the outputs.

public class Game{
	Game(){
		
	}
	
	static public void outputLevel(Alice p){
		Worldmap temp = new Worldmap();	//dummy object made to access Worldmap
		p.setLevel(temp.map(p));
		try{Thread.sleep(3000);}	//This will wait 3 seconds
		catch(InterruptedException ex){Thread.currentThread().interrupt();}
	}	
	
	public void Battle(Alice p, Queen q){
		if(p.getRope() == true){p.setAttack(p.getAttack()*2);}		//2x multiplier if you have rope
		if(p.getDagger() == true){p.setAttack(p.getAttack()*2);}	//2x multiplier if you have dagger
		if(p.getLighter() == true){p.setAttack(p.getAttack()*2);}	//2x multiplier if you have lighter
		if(p.getChainsaw() == true){p.setAttack(p.getAttack()*2);}	//2x multiplier if you have chainsaw
		
		while(p.getHP() > 0 && q.getHP() > 0){
			TextIO.putln("Player HP: " + p.getHP() + "\t"+ q.getName() +" HP: " + q.getHP());	//Output status of fight
			
			try{Thread.sleep(500);}	//This will wait 0.5 seconds
			catch(InterruptedException ex){Thread.currentThread().interrupt();}
			
			
			p.setHP(p.getHP() - q.moveQueen(p.random100()) );		//Determine queen's move
			if(p.getHP() <= 0){
				TextIO.putln("Player HP: " + p.getHP() + "\t"+ q.getName() +" HP: " + q.getHP());	//Output status of fight
				break;
			}								//player has their hp hit 0
			q.setHP(q.getHP() - p.moveAlice());						//Determine player's move
			if(q.getHP() <= 0){
				TextIO.putln("Player HP: " + p.getHP() + "\t"+ q.getName() +" HP: " + q.getHP());	//Output status of fight
				q.Defeated();
			}							//queen has their hp hit 0
		}	
	}	
	
	public static void main(String[] args){
		Game instance = new Game(); // make dummy constructor of game class
		boolean gameActive = true; // game active, this will end game if false
		Alice player = new Alice("Player", 100, 1); // make player character
		Queen boss = new Queen("Mad Queen", 1000, 3); // make boss character
		Queen clown = new Queen("Evil Clown1",50,2);//make enemy character
		Queen clown2 = new Queen("Evil clown2",300,2);//make second enemy character
		
		
		
		while(gameActive){ 
			TextIO.putln("------------------------------------------------------------------------------------------------------------");
			instance.outputLevel(player);
			TextIO.putln();
			
			if(player.getLevel() == 99){
				instance.Battle(player, boss);
				if(boss.isDefeated() == false){
					TextIO.putln("You could not defeat the Queen and must start over.");//Queen not defeated message
					gameActive = false;
				}	
				else{
					TextIO.putln("You have defeated the queen and teleport back to reality!");//Queen defeated message
					gameActive = false;
				}	
			}	
			if(player.getLevel() == 90 && clown.isDefeated() == false){
				instance.Battle(player, clown);
				if(clown.isDefeated() == false){
					TextIO.putln("You could not defeat the First Evil Clown and must start over.");//Clown1 not defeated
					gameActive = false;
				}	
				else{
					TextIO.putln("You have defeated the First Evil Clown!");//Clown1 defeated
					player.setLevel(5);
					clown.Defeated();
				}	
			}				
			if(player.getLevel() == 80 && clown2.isDefeated() == false){//Clown2 not defeated
				instance.Battle(player, clown2);
				if(clown2.isDefeated() == false){
					TextIO.putln("You could not defeat the Second Evil Clown and must start over.");
					gameActive = false;
				}	
				else{
					TextIO.putln("You have defeated the Second Evil Clown!");//Clown2 defeated
					clown2.Defeated();
					player.setLevel(13);
				}	
			}			
		}
	}
}