/**
* Title: Alice
* description: Player class for Game
* date: 2021-04-30
* @author Andrew Mackay
* @version 1
* @copyright 2001-2020 Andrew Mackay
*/



import textio.TextIO;		//This is for the use of textio.
import java.util.Random;	//This is so random100() can use random numbers.

public class Alice{
	private String name = " ";					//The name of the player
	private int hp = 0;							//health points of the character
	private int attack = 0;						//attack points of the character
	private Inventory bag = new Inventory();	//creates an empty inventory
	private int levelLocation = 0;				//Level location
	
	/**
     * Default constructor for Alice class
     * 
     * 
     */
	Alice(){
		
	}
	/**
     * Parameter constructor for Alice class.
     * 
     * parameter n - name of player's character (String)
	 * parameter h - value of player's health points (HP) (int)
	 * parameter h - value of player's attack points (int)
	 * 
	 * levelLocation is automatically set to one upon object creation.
	 * bag with 10 slots is automatically created when object is created.
     */
	Alice(String n, int h, int a){
		name = n;
		hp = h;
		attack = a;
		levelLocation = 1;
	}	
	
	/**
	* This is to access name variable of Alice class
	*
	* return name (String)
	*/		
	public String getName(){
		return name;
	}
	
	/**
	* This is to access HP variable of Alice class
	*
	* return hp (int)
	*/		
	public int getHP(){
		return hp;
	}
	
	/**
	* This is to access attack variable of Alice class
	*
	* return attack (int)
	*/		
	public int getAttack(){
		return attack;
	}
	
	/**
	* This is to access levelLocation variable of Alice class. Used
	* for the game's logic in choosing the correct level to display.
	* return levelLocation (int)
	*/	
	public int getLevel(){
		return levelLocation;
	}
	
	/**
	* This is to access bag variable of Alice class. Most of
	* calculation/output is passed off to inventory class.
	* return void
	*/	
	public void getBag(){
		bag.checkBag();
	}
	
	/**
	* Checks if the player has a rope in their bag.
	* 
	* return true/false (Boolean)
	*/		
	public boolean getRope(){
		return bag.getRope();
	}	

	/**
	* Checks if the player has a dagger in their bag.
	* 
	* return true/false (Boolean)
	*/	
	public boolean getDagger(){
		return bag.getDagger();
	}	
	
	/**
	* Checks if the player has a lighter in their bag.
	* 
	* return true/false (Boolean)
	*/	
	public boolean getLighter(){
		return bag.getLighter();
	}	
	
	/**
	* Checks if the player has a chainsaw in their bag.
	* 
	* return true/false (Boolean)
	*/	
	public boolean getChainsaw(){
		return bag.getChainsaw();
	}		

	/**
	* Checks if the player has a secret potion in their bag.
	* 
	* return true/false (Boolean)
	*/	
	public boolean getSecretPotion(){
		return bag.getSecretpotion();
	}		
	
	/**
	* Checks if the player has a apple in their bag.
	* 
	* return true/false (Boolean)
	*/	
	public boolean getApple(){
		return bag.getApple();
	}		
	
	/**
	* Sets member variable name to n
	* 
	* parameter n - represents name of player (String)
	*/		
	public void setName(String n){
		name = n;
	}
	
	/**
	* Sets member variable hp to h
	* 
	* parameter h - represents HP of player (int)
	*/		
	public void setHP(int h){
		hp = h;
	}	
	
	/**
	* Sets member variable attack to a
	* 
	* parameter a - represents attack of player (int)
	*/		
	public void setAttack(int a){
		attack = a;
	}
	
	/**
	* Sets member variable levelLocation to l. This
	* is called to change player level.
	* parameter l - represents level player is currently on (int)
	*/	
	public void setLevel(int l){
		levelLocation = l;
	}	
	
	/**
	* Based on random output of random100(). percentages for moves
	* are 10%, 50%, 40%, and 10% respectively.
	* return int - This is the attack damage calculation
	*/		
	public int moveAlice(){
		int decision = random100();
		if(decision <= 10){
			TextIO.putln("Alice performs a weak attack!");
			return getAttack();
		}
		else if(decision <= 60){
			TextIO.putln("Alice performs a normal attack!");
			return getAttack() * 2;
		}	
		else if(decision <= 90){
			TextIO.putln("Alice performs a critical hit!");
			return getAttack() * 4;
		}		
		else{
			TextIO.putln("Alice misses!");
			return 0;
		}	
	}
	
	/**
	* This will generate a random number between 1-100. This is accessed
	* by Alice and Queen classes for battles with clowns and queens.
	* return int (possible range is 1-10)
	*/	
	public int random100(){			//returns random number between 1-100
		Random rand = new Random();
		int sum = rand.nextInt(100);
		sum = sum + 1; //This is so the range will be 1-100
		return sum;
	}	
	
	/**
	* Accesses inventory class through player's bag object. This
	* will add a rope to the bag array which can be viewed.
	* return void
	*/		
	public void aliceRope(){//creates Rope item
		bag.pickUpRope();
	}	
	
	/**
	* Accesses inventory class through player's bag object. This
	* will add a dagger to the bag array which can be viewed.
	* return void
	*/		
	public void aliceDagger(){//creates Dagger item
		bag.pickUpDagger();
	}	
	
	/**
	* Accesses inventory class through player's bag object. This
	* will add a lighter to the bag array which can be viewed.
	* return void
	*/		
	public void aliceLighter(){//creates Lighter item		
	bag.pickUpLighter();
	}	
	
	/**
	* Accesses inventory class through player's bag object. This
	* will add a chainsaw to the bag array which can be viewed.
	* return void
	*/		
	public void aliceChainsaw(){//creates Chainsaw item
        bag.pickUpChainsaw();
	}
	
	/**
	* Accesses inventory class through player's bag object. This
	* will add a secret potion to the bag array which can be viewed.
	* return void
	*/		
	public void aliceSecretPotion(){//creates Secret Potion item
        bag.pickUpSecretpotion();
	}

	/**
	* Accesses inventory class through player's bag object. This
	* will add a apple to the bag array which can be viewed.
	* return void
	*/		
	public void aliceApple(){//creates Apple item
        bag.pickUpApple();
	}	
	
	/**
	* Accesses inventory class through player's bag object. This
	* will add a mushroom to the bag array which can be viewed.
	* return void
	*/		
	public void aliceMushroom(){//creates Mushroom item
        bag.pickUpMushroom();
	}		
}
