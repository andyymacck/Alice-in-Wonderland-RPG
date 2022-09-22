/**
* Title: Worldmap
* description: Player class for Game
* date: 2021-04-30
* @author Andrew Mackay
* @version 1
* @copyright 2020 Andrew Mackay
*/



import textio.TextIO;

public class Worldmap{
	Worldmap(){
		
	}

	static public int map(Alice p){
		int temp = 0;
		int level = p.getLevel();
		
		final int OpeningLevel = 0;
		final int AliceGarden =  1;
		final int RabbitHole = 2;
		final int FirstRoom = 3;
		final int TheForest = 4;
		final int ForestFork = 5;
		final int LeftForest = 6;
		final int RightForest = 7;
		final int DaggerPath = 8;
		final int Wonderland = 9;
		final int TeaParty = 10;
		final int CliffDescent = 11;
		final int FightClown2 = 12;
		final int DefeatedClown2 = 13;
		final int EnteringCastle = 14;
		final int FightClown1 = 15;
		final int DefeatedClown = 16;
		final int WonderlandMeadow = 17;

		final int ClownBattle1 = 90;
		final int ClownBattle2 = 80;
		final int QueenBattle = 99;
		
		if (level == OpeningLevel){	//Title page
			TextIO.putln("Welcome to Alice in wonderland!");//initial display message
			TextIO.getInt();
		}	
		else if (level == AliceGarden) {//Garden
			TextIO.putln("You are now in Alices Garden. It's peaceful here. You notice a rabbit dash across the garden, you follow him into what appears to be a rabbit hole.");//first level intro
			TextIO.putln("1 to stay in the Garden\n2 to go down the Rabbit Hole\n3 to check bag");//options description
			while(temp != 1 && temp != 2){
				temp = TextIO.getInt();
				if(temp == 1){
					TextIO.putln("You stay in the garden.");//remain in level 1
					return AliceGarden;
				}
				else if(temp == 2){
					TextIO.putln("You go down the rabbit hole!");//entering level 2
					return RabbitHole;
				}
				else if(temp == 3){
					p.getBag();//check bag
				}	
				else{
					TextIO.putln("Not a valid input. Must be number 1, 2, 3.");//invalid selection statement
				}	
			}
		}
		else if (level == RabbitHole) {//RabbitHole
			TextIO.putln("You are sliding down the Rabbit Hole! ");//level 2 action description
			TextIO.putln("You see a vision of a woman with an obscenley large forehead\n as you plummet down this hole she transmits this message to you");
			TextIO.putln("If you make it to Wonderland\n you will never return! she maniacally exclaims");
			return FirstRoom;
		}
		else if (level == FirstRoom) {//Checkered room
			TextIO.putln("You finally see a wooden door\n after falling down the hole for some time");//level 3 pre intro
			TextIO.putln("Big room, checkered floors with ceilings so tall they disappear into darkness..");//level 3 intro
			TextIO.putln("At the end of the corridor you notice there is some light coming from what looks to be outside..\n");//description of circumstance
			TextIO.putln("You see 2 strange looking twins emerge from the corner of the room,one is holding what appears to be a potion");
			TextIO.putln("Hello Alice, we have this growth potion, our world is bigger than yours and you'll want this to face the monsters out there - Say the strange twins");//character dialogue
			TextIO.putln("1 to go back up the rabbit hole\n2 to check out the light coming in the room\n3 take potion\n4 to check bag");//level 3 options
			
			while(temp != 2){
				temp = TextIO.getInt();
				if(temp == 1){
					TextIO.putln("The rabbit hole is too steep to go back up. You go towards the light.");//return to room
					return TheForest;
				}
				else if(temp == 2){
					TextIO.putln("You walk down the corridor towards the light.");//go towards next level
					return TheForest;
				}
				else if(temp == 3){
					TextIO.putln("You grow twice as tall!Gain 50hp");//gain 50hp
					p.setHP(p.getHP() + 50);//50hp is gained
					return TheForest;
				}
				else if(temp == 4){
					p.getBag();//check bag 
				}	
				else{
					TextIO.putln("Not a valid input. Must be number 1, 2, 3.");//invalid input
				}	
			}			
		}
		else if (level == TheForest) {//Forest entry
			TextIO.putln("Enter The Forest,dark and stormy, tall trees surround you as far as the eye can see..");//level 4 intro
			TextIO.putln("You notice there is a rope hanging from a nearby tree..");
			TextIO.putln("1 to pick up the rope\n2 to continue into the forest\n3 to check bag");//level 4 options
			while(temp != 2){
				temp = TextIO.getInt();
				if(temp == 1){
					TextIO.putln("You pick up the rope from off of the tree and continue into the forest");//equip rope
					p.aliceRope();
					return FightClown1;
				}
				else if(temp == 2){
					TextIO.putln("You continue your walk down the forest path.");//keep the same path
					return FightClown1;
				}
				else if(temp == 3){//check bag
					p.getBag();
				}						
				else{
					TextIO.putln("Not a valid input. Must be number 1, 2, 3.");//invalid option
				}	
			}
		}
		else if (level == FightClown1) {//Fight clown1
			TextIO.putln("A strange sensation passes over you\n the winds begin howling and from the forest emerges an evil clown!");//evil clown fight
			TextIO.putln("he walks forth with blood crazed eyes, he looks incredibly determined..!");
			return ClownBattle1;
		}		
		else if (level == DefeatedClown) {//Defeated evil clown1
			TextIO.putln("You have defeated the Evil Clown!");//defeated evil clown
			return ForestFork;
		} 				
		else if (level == ForestFork) {//potion side effects
			TextIO.putln("As you continue into the forest you find yourself at a fork in the road..");//level 5 intro 
			TextIO.putln("1 to go left\n2 to go right\n3 to check bag");//level 5 options
			while(temp != 2){
					temp = TextIO.getInt();
					if(temp == 1){
						TextIO.putln("You decide to go to the left.");//left option message
						p.aliceRope();
						return LeftForest;
					}
					else if(temp == 2){
						TextIO.putln("You decide to go to the right.");//right option message
						TextIO.putln("A clearing is ahead, you go forth and see the sky more clearly but it appears murky and pink\n you see a giant caterpillar emerge from the far reaches of the clearing and slowly makes its way towards you..");
						TextIO.putln("You realise this is probably a side effect of the potion from earlier, and turn back around");//scene description for option 2
						return RightForest;
					}
					else if(temp == 3){
						p.getBag();
					}	
					else{
						TextIO.putln("Not a valid input. Must be number 1, 2, 3.");//invalid selection
					}	
				}			
		}
		
		else if (level == LeftForest) {//left forest
			TextIO.putln("You walk for about 10 minutes when you hit a dead-end.");//level 6 intro
			TextIO.putln("You see something glimmering from underneath some dirt.");//item hint
			TextIO.putln("1 to check under the dirt\n2 to turn back down the path\n3 to check bag");//level 6 options
			while(temp != 2){
					temp = TextIO.getInt();
					if(temp == 1){
						TextIO.putln("You sift through the dirt and find a lighter!.\nYou then head back to the fork in the road and go right.");//found lighter
						p.aliceLighter();
						return RightForest;
					}
					else if(temp == 2){
						TextIO.putln("You turn back down the path until you get to the fork in the road and then continue to the right.");//option 2 right turn
						return RightForest;
					}
					else if(temp == 3){
						p.getBag();//check bag
					}						
					else{
						TextIO.putln("Not a valid input. Must be number 1, 2, 3.");//invalid selection
					}	
				}			
		}
		else if (level == RightForest) {//right forest
			TextIO.putln("You are walking down a cold misty forest path.");//right forest intro
			return WonderlandMeadow;
		}
		else if (level == WonderlandMeadow) {//meadow
			TextIO.putln("A dew drop from a towering mushroomn\nfalls to the earth and you find yourself being caried into a stream\n further into the mystical forest");
			TextIO.putln("As you are carried away, you see the stream ends\n in a vast meadow with a comforting shade as it has turned to night");
			TextIO.putln("Amongst some foliage you see some human size objects");
			TextIO.putln("1 pick up Mushroom \n2 Check under dirt \n3 to check bag");//
			while(temp != 2){
				temp = TextIO.getInt();
				if(temp == 1){
					TextIO.putln(" The baby mushroom is sprouting\nif it isn't picked now it will be much too big to eat soon!");//
					p.aliceMushroom();
					return DaggerPath;
				}
				else if(temp == 2){
					TextIO.putln(" You see a glimmering glassy object in the dirt.");//
					TextIO.putln(" After some rummaging, you uncover the bottle which is labled Secret Potion ");//
					p.aliceSecretPotion();
					return DaggerPath;
				}
				else if(temp == 3){
					p.getBag();//check bag for items
				}			
				else{
					TextIO.putln("Not a valid input. Must be number 1, 2, 3.");//invalid input
				}	
			}				
		}
		else if (level == DaggerPath) {//dagger path
			TextIO.putln("As you are walking down the path you see a treasure chest in the distance..");//item discovery
			TextIO.putln("1 to check out the chest\n2 to continue down the road\n3 to check bag");//item discovery options
			while(temp != 2){
						temp = TextIO.getInt();
						if(temp == 1){
							TextIO.putln("You walk to the chest and open it. Inside is a shiny dagger!");//dagger option
							TextIO.putln("You go back to the path and continue walking down the cold road.");//equip dagger, leave path
							p.aliceDagger();
							return Wonderland;
						}
						else if(temp == 2){
							TextIO.putln("You ignore the chest and continue down the cold path.");//ignore chest, return
							return Wonderland;
						}
						else if(temp == 3){
							p.getBag();//check bag for items
						}			
						else{
							TextIO.putln("Not a valid input. Must be number 1, 2, 3.");//invalid input
						}	
					}				
		}
		else if (level == Wonderland) {//Wonderland
		TextIO.putln("The sun has peaked through the sky\nThe path widens into a vast cravass\nthere are tall mushrooms, and bushes, with trees twice as tall");
		TextIO.putln("You are now in Wonderland");
		TextIO.putln("as you stumble through the vast territory aimlessly\n you begin to wonder if the growing potion wore off\n or if everything had gotten bigger");
		return TeaParty;
		}	
		else if (level == TeaParty) {//Tea party		
			TextIO.putln("You see a dash of light in your periferal vision\n you look and see the mad hatter heading down a path that heads to a small house.");
			TextIO.putln("Upon entering the house\n you see several figures sitting, gathered around a large dining table drinking tea and playing cards,\na Large black Cat,  The Mad Hatter and A giant Caterpillar");
			TextIO.putln("What have we here? Questions the Mad Hatter. You know it is quite rude to intrude.. but please sit and have some tea");
			TextIO.putln("The Hatter, Cat and Caterpillar all are whispering amongst eachother\n you see the Hatter slip something in the tea");
			TextIO.putln("Here you go\n he says as he passes you the tea");
			TextIO.putln("1 you drink the tea\n2 don't drink the tea");
			
			while(temp != 2){
				temp = TextIO.getInt();
				if(temp == 1){
					TextIO.putln("You were tricked! lose 10hp");
					p.setHP(p.getHP() - 10);
				}
				else if(temp == 2){
					TextIO.putln("You throw the tea in their faces and leave");
				}
				else{
					TextIO.putln("Invalid entry");	
				}
				return CliffDescent;
			}
		}
		else if (level == CliffDescent) {//Cliff descent
			TextIO.putln("After walking for some time you see bright light\n at the end of the path ahead of you. As you walk further you see you are on a large cliff-face.");
			TextIO.putln("You look for a way down the cliff. If only you had a rope to help get you down safely...");
			if(p.getRope() == true){
				TextIO.putln("You tie the rope to a rock and journey down the cliff face.");//
			}		
			else{
				TextIO.putln("You take the long way down the cliff face.");
			}				
			return FightClown2;
		}
		else if (level == FightClown2) {//Fight clown 2
			TextIO.putln("Upon reaching the bottom of the cliff, you walk around the base of the cliff\nYou hear a screech, and spot another Evil clown holding a chainsaw!\n This one looks twice as angry\n and twice as determined!");//clown description
			return ClownBattle2;
		}	
		else if (level == DefeatedClown2) {//Defeated evil clown 2
			TextIO.putln("Upon defeating the clown\n you pick up his chainsaw");
			p.aliceChainsaw();
			TextIO.putln("You feel a fierce wind from behind you..\nit pushes you along the path and is too strong to fight");
			TextIO.putln("You stumble on down the path\n to discover a large stone castle at the top of a hill");//castle discovery
			return EnteringCastle;
		}
		else if (level == EnteringCastle) {//Entering castle
			TextIO.putln("You are entering the castle. The Queen appears at the top of the stair case, floating. She says - It is time for you to face me at last!");
			TextIO.putln("Every item you have picked up will help you in the fight (2x damage stacking per item)...");
			return QueenBattle;
		}
		return temp;
	}
}
	

