/**
 * @author Brazen
 *Hero Class of COMP1011 - Assignment 1.
 *Generates a hero's abilities, determines if his/her hit
 *attempt is successful, and calculates the damage dealt.
 *@Modified January 25, 2015.
 */

//Variables Initiated
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
	
	/**
	 * Randomly generates a hero's abilities.
	 * Each ability is an integer between 1 and 100.
	 */
	private void generateAbilities() {
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	}
	
	/**
	 * Randomly determines whether a hit attempt is successful.
	 * A hit attempt will be successful 20 percent of the time.
	 * @return a boolean value.
	 */
	private boolean hitAttempt() {
		int hitOrMiss;
		
		hitOrMiss = (int)(Math.random() * 10 + 1);
		
		if (hitOrMiss == 1 || hitOrMiss == 2) {
			return true;
		}
		else {
		return false;
		}
	}
	
	/**
	 * This method calculates the damage dealt when a hit attempt
	 * is successful. The damage is calculated by the hero's strength
	 * multiplied by a random number between 1 and 6.
	 * @return an integer.
	 */
	private int hitDamage() {
		int damage;
		int multiplier;
		
		multiplier = (int)(Math.random() * 6 + 1);
		damage = strength * multiplier;
		
		return damage;
	}
	
	//--------------------Public Methods--------------------
	
	/**
	 * Displays a Hero's ability statistics.
	 */
	public void show(){
		System.out.println("-----Hero Abilities-----");
		System.out.println("Strength: " + strength);
		System.out.println("Speed: " + speed);
		System.out.println("Health: " + health);
		System.out.println("------------------------");
	}
	
	/**
	 * Initiates a fight if a hit attempt from method 
	 * hitAttempt() returns a value of true.
	 */
	public void fight() {
		hitAttempt();
		if (hitAttempt() == true) {
			System.out.println("Target hit! " + name + " dealt " + hitDamage() + " damage.");
		}
		else {
			System.out.println(name + " missed the target in a desperate and overambitious attempt.");
		}
	}	
}
