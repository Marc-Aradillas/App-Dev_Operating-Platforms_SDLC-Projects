/*
 * Marc Aradillas
 * Southern New Hampshire University
 * CS-230 Operating Platforms
 * 19 March, 2023
 * 
 * Singleton Pattern - ensures that a class has only one instance and provides a global point of access to it.
 */


package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator; // added java. util package for iterator to loop through any collection of objects - Marc Aradillas
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author Marc.aradillas@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	// FIXME: Add missing pieces to turn this class a singleton 
	
	// Added TeamID - Marc Aradillas
	
	private static long nextTeamId = 1;
	
	// Added PlayerID - Marc Aradillas
	
	private static long nextPlayerId = 1;
	
	private static GameService instance; // added for the singleton instance of the GameService class - Marc Aradillas
	
	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply return the existing instance
		
		// Use iterator to look for existing game with same name
		Iterator<Game> it = games.iterator(); // iterator over the 'games' collection which is used to iterate through its elements one by one.
		while (it.hasNext()) { // while loop that iterates through each element of the 'games' collection.
			Game g = it.next(); // retrieves next element of 'game' collection and assigns it to the 'g' variable.
			if (g.getName().equals(name)) { // checks whether the name of the current 'Game' object matches the specified name.
				game = g; // assigned current 'Game' object to the 'game' variable.
				break; // exits loop after specified 'Game' object has been found - Marc Aradillas
			}
		}
		

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable
		Iterator<Game> it = games.iterator(); // allows to traverse the collection and access each game object in turn
		while (it.hasNext()) { // while loop is used to iterate through the collection 
			Game g = it.next(); // in loop game object is retrieved from the iterator using the 'next()' method and assigned to a variable 'g'
			if (g.getId() == id) { // if statement used to compare id of current game object 'g' with given 'id'
				game = g;		   // if the ids match, the current game object 'g' is assigned to variable 'game'
				break;			   // then the loop is exited using the break statement - Marc Aradillas
			}
		}

		return game; // game is finally returned outside the loop, which will contain the game object with the matching id or null if no match is found.
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply assign that instance to the local variable

		// Use iterator to look for existing game with same name
		Iterator<Game> it = games.iterator();
		while (it.hasNext()) {
			Game g = it.next();
			if (g.getName().equals(name)) { // The if statement checks if the name of the current Game object g 
				game = g;					// matches the specified name. If it does, it assigns the g object to
				break;						// the game variable, and exits the loop using the break statement. - Marc Aradillas
			}
		}

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
	
	// Added getNextTeamId to return teamsId - Marc Aradillas
	public long getNextTeamId() { 
		return nextTeamId++;
	}
	
	// Added getNextPlayerId to return playerId - Marc Aradillas

	public long getNextPlayerId() {
		return nextPlayerId++;
	}

	// added a getInstance static method which was not defined in the GameService Class
	// returns the singleton instance of the GameService Class - Marc Aradillas
	public static GameService getInstance() {
		if (instance == null) {
			instance = new GameService();
			}
		return instance;
	}
}
