/**
* Title: Queen
* description: Queen class for Game
* date: 2021-04-30
* @author Andrew Mackay
* @version 1
* @copyright 2020 Andrew Mackay
*/





import textio.TextIO;

public class Queen{
	private String name = " "; // place holder name
	private boolean defeated = false; // for when queen is defeated
	private int hp = 0; // health points
	private int attackPower = 0; // attack points
	private int weakAttack = 1;
	private int strongAttack = 2;
	private int heal = 3;
	private int missAttack = 4;

	Queen(){
	
	}
	Queen(String n,int h,int a){
		name = n;
		hp = h;
		attackPower = a;
	}
	public String getName(){
		return name;
	}
	
	public int getHP(){
		return hp;
	}
	
	public int getAttackPower(){
		return attackPower;
	}
	
	public void setName(String n){
		name = n;
	}
	public void setHP(int h){
		hp = h;
	}
	public void setAttackPower(int a){
		attackPower = a;
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
		if(m<=20){
			TextIO.putln(getName()+ " uses weak attack");
			return getAttackPower();
		}
		else if(m<=60){
			TextIO.putln(getName()+ " strong attack");
			return getAttackPower() * 2;
		}
		else if(m<=80){
			TextIO.putln(getName()+ " herself");
			setHP(getHP() + 5);
			return 0;
		}
		else{
			TextIO.putln(getName()+ "misses attack");
			return 0;
		}
	}	
}
