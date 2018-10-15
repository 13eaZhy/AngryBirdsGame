package characters;

public class BirdBase {
	static int count;
	//Properties
	byte damage;  //0..100
	byte health;  //0..100
	String name;
	
	// CONTRUCTOR
	BirdBase(String n){
		name   = n;
		damage = 50;
		health = 100;
	}
	
	public void status(){
		System.out.println("##############################\nBird name : "+name+"\nBird status\nDMG: " + damage + "\nHP: " + health);
	}
	
	//Methods
	void fly(){
		
	}
	void attack(){
		
	}
}
 
