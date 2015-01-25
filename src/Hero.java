
public class Hero {
	private int strength;
	private int speed;
	private int health;
	public String name;
	
	//---------------------Constructor---------------------
	public Hero(String name) {
		this.name = name;
		generateAbilities();
	}
	
	//-----------------------Getters-----------------------
	public int getStrength() {
		return strength;
	}

	public int getSpeed() {
		return speed;
	}

	public int getHealth() {
		return health;
	}
	
	//-------------------Private Methods--------------------
	private void generateAbilities() {
		
	}
	

	public void fight() {
		
	}
	
	public boolean hitAttempt() {
		return false;
	}
	
	public int hitDamage() {
		return health;
		
	}
}
