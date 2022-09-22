/**
* Title: Inventory
* description: Item Inventory
* date: 2021-04-30
* @author Andrew Mackay
* @version 1
* @copyright 2020 Andrew Mackay
*/


import textio.TextIO;	//This is so textio can be used.

public class Inventory{
	//member variables
	private int bagSize = 10;	//This is the max amount of items alice can hold.
	String[] bag = new String[10];	//This will be where items are held.
	
	/**
     * Default constructor for inventory class. No parameters
     * but sets all values of bag[] to " ".
     * 
     */
	Inventory(){
		//bag size is always set three for this scope.
		bag[0] = " ";
		bag[1] = " ";
		bag[2] = " ";
		bag[3] = " ";
		bag[4] = " ";
		bag[5] = " ";
		bag[6] = " ";
		bag[7] = " ";	
		bag[8] = " ";
		bag[9] = " ";			
	}	
	
	/**
     * This will cycle through your bag, ignoring empty spaces.
     * 
     * returns void
     */
	public void checkBag(){
		if(bag[0] == " " && bag[1] == " " && bag[2] == " "){
			TextIO.putln("Your bag is empty.. Find some items!");	
		}	
		else{
			TextIO.putln("The contents of your bag is:");
			for(int i = 0; i < 3; i++){
				if(bag[i] != " "){
					TextIO.putln(bag[i]); 
				}	
			}	
		}
	}	
	
	/**
	* Checks if the rope is in the bag.
	*
	* return true/false (Boolean)
	*/	
	public boolean getRope(){
		for(int i = 0; i < 3; i++){
			if(bag[i] == "Rope"){
				return true;
			}	
		}	
		return false;	
	}
	
	/**
	* Checks if the dagger is in the bag.
	*
	* return true/false (Boolean)
	*/	
	public boolean getDagger(){
		for(int i = 0; i < 3; i++){
			if(bag[i] == "Dagger"){
				return true;
			}	
		}	
		return false;	
	}
	
	/**
	* Checks if the lighter is in the bag.
	*
	* return true/false (Boolean)
	*/	
	public boolean getLighter(){
		for(int i = 0; i < 3; i++){
			if(bag[i] == "Lighter"){
				return true;
			}	
		}	
		return false;	
	}	
	
	/**
	* Checks if the chainsaw is in the bag.
	*
	* return true/false (Boolean)
	*/					
	public boolean getChainsaw(){
		for(int i = 0; i < 3; i++){
			if(bag[i] == "Chainsaw"){
				return true;
			}	
		}
		return false;
	}	
	
	/**
	* Checks if the secret potion is in the bag.
	*
	* return true/false (Boolean)
	*/		
	public boolean getSecretpotion(){
		for(int i = 0; i < 3; i++){
			if(bag[i] == "Secretpotion"){
				return true;
			}	
		}
		return false;
	}
	
	/**
	* Checks if the apple is in the bag.
	*
	* return true/false (Boolean)
	*/					
	public boolean getApple(){
		for(int i = 0; i < 3; i++){
			if(bag[i] == "Apple"){
				return true;
			}	
		}	
		return false;	
	}
	
	/**
	* Checks if the mushroom is in the bag.
	*
	* return true/false (Boolean)
	*/					
	public boolean getMushroom(){
		for(int i = 0; i < 3; i++){
			if(bag[i] == "Mushroom"){
				return true;
			}	
		}	
		return false;	
	}
	
	/**
	* "Pick up" rope by adding it to the player's bag. Checks
	* if the player already has a "Rope".
	* return void
	*/					
	public void pickUpRope(){
		for(int i = 0; i < 3; i++){
			if( (bag[i] == " ") && (getRope() == false) ){
				bag[i] = "Rope";
			}	
		}	
	}	
	
	/**
	* "Pick up" dagger by adding it to the player's bag. Checks
	* if the player already has a "Dagger".
	* return void
	*/					
	public void pickUpDagger(){
		for(int i = 0; i < 3; i++){
			if( (bag[i] == " ") && (getDagger() == false) ){
				bag[i] = "Dagger";
			}	
		}	
	}
	
	/**
	* "Pick up" lighter by adding it to the player's bag. Checks
	* if the player already has a "Lighter".
	* return void
	*/					
	public void pickUpLighter(){
		for(int i = 0; i < 3; i++){
			if( (bag[i] == " ") && (getLighter() == false)){
				bag[i] = "Lighter";
			}
		}
	}
	
	/**
	* "Pick up" chainsaw by adding it to the player's bag. Checks
	* if the player already has a "Chainsaw".
	* return void
	*/					
	public void pickUpChainsaw(){
		for(int i = 0; i < 3; i++){
			if( (bag[i] == " ") && (getChainsaw() == false)){
				bag[i] = "Chainsaw";
			}
		}
	}	
	
	/**
	* "Pick up" secret potion by adding it to the player's bag. Checks
	* if the player already has a "Secret potion".
	* return void
	*/					
	public void pickUpSecretpotion(){
		for(int i = 0; i < 3; i++){
			if( (bag[i] == " ") && (getSecretpotion() == false)){
			bag[i] = "Secret potion";
			
			}
		}	
	}
	
	/**
	* "Pick up" apple by adding it to the player's bag. Checks
	* if the player already has a "Apple".
	* return void
	*/					
	public void pickUpApple(){
		for(int i = 0; i < 3; i++){
			if( (bag[i] == " ") && (getApple() == false) ){
				bag[i] = "Apple";
			}	
		}	
	}	
	
	/**
	* "Pick up" mushroom by adding it to the player's bag. Checks
	* if the player already has a "Mushroom".
	* return void
	*/					
	public void pickUpMushroom(){
		for(int i = 0; i < 3; i++){
			if( (bag[i] == " ") && (getMushroom() == false) ){
				bag[i] = "Mushroom";
			}	
		}	
	}	
}

	
