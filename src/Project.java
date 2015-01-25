/**
 * @author Brazen
 *Main Class of COMP1011 - Assignment 1.
 *Creates a hero, displays his ability statistics, 
 *determines if he has successfully hit a target and 
 *how much damage was dealt.
 *@Modified January 25, 2015.
 */
public class Project {

	/**
	 * Creates a hero, displays his ability statistics and initiates a fight.
	 */
	public static void main(String[] args) {
		Hero hero = new Hero("Nighthawk");
		hero.show();
		hero.fight();
	}
}
