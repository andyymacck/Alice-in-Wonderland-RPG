/**
* Title: Queen
* description: Queen class for Game
* date: 2021-04-30
* @author Andrew Mackay
* @version 1
* @copyright 2020 Andrew Mackay
*/


import textio.TextIO;

public class Queen extends GameCharacter{
	
	private boolean defeated = false; // for when queen is defeated
	
	

	Queen(){
	
	}
	Queen(String n, int hp, int attack){
	super(n, hp, attack);
	
	
}
	

	

	public boolean isDefeated(){
		return defeated;
	}	
	
	public void Defeated(){
		defeated = true;
	}		
	public void move(int m){
		TextIO.putln("This is the default move and should not ever be called.");
	}
	public int moveQueen(int m){
		int attackPowerToBeReturned = getAttack();
		if(m<=20){
			TextIO.putln(getName()+ " uses weak attack");
			TextIO.putln("Attack power: " + attackPowerToBeReturned);
			return attackPowerToBeReturned;
		}
		else if(m<=60){
			TextIO.putln(getName()+ " strong attack");
			TextIO.putln("Attack power: " + attackPowerToBeReturned*2);
			return attackPowerToBeReturned * 2;
		}
		else if(m<=80){
			TextIO.putln(getName()+ " heals herself");
			setHP(getHP() + 5);
			return 0;
		}
		else{
			TextIO.putln(getName()+ "misses attack");
			return 0;
		}
	}	
}
