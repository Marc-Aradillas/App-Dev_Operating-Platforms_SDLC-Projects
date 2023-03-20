/*
 * Marc Aradillas
 * Southern New Hampshire University
 * CS-230 Operating Platforms
 * 19 March, 2023
 * 
 */

package com.gamingroom;

/**
 * A class to test a singleton's behavior
 * 
 * @author marc.aradillas@snhu.edu
 */
public class SingletonTester {

	public void testSingleton() {
		
		System.out.println("\nAbout to test the singleton...");
		
		// FIXME: obtain local reference to the singleton instance
		GameService service = GameService.getInstance(); // replaced null with singleton instance
		
		// a simple for loop to print the games
		for (int i = 0; i < service.getGameCount(); i++) {
			System.out.println(service.getGame(i));
		}

	}
	
}
