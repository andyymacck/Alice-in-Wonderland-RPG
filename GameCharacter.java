import textio.TextIO;

public class GameCharacter {
    
        private String name = " "; // place holder name
        private boolean defeated = false; // for when queen is defeated
        private int hp = 0; // health points
        private int attack = 0; // attack points

        GameCharacter(){
        
        }
        GameCharacter(String n,int h, int a){
            name = n;  
            hp = h; 
            attack = a;
        }
     
        public String getName(){

            return name;
            
        }

        public int getHP(){
           
            return hp;
            
        }
  
        public int getAttack(){
           
            return attack; 
        }

        public void  setAttack(int a){
            attack = a;
            TextIO.putln("set attack" + attack);
        }
        public void setName(String n){
            name = n;
          
        }
        public void setHP(int h){
            hp = h;
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
      
    
    
        }	
