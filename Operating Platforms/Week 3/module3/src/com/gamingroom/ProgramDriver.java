/*
 * Marc Aradillas
 * Southern New Hampshire University
 * CS-230 Operating Platforms
 * 19 March, 2023
 * 
  */

package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author marc.aradillas@snhu.edu
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		// FIXME: obtain reference to the singleton instance
		GameService service = GameService.getInstance(); // replaced null with singleton instance
		
		System.out.println("\nAbout to test initializing game data...");
		
		// initialize with some game data
		Game game1 = service.addGame("Game #1");
		System.out.println(game1);
		Game game2 = service.addGame("Game #2");
		System.out.println(game2);
		
		// use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
	}
}

/*
*
*
*
*
*
*
*
*
*/