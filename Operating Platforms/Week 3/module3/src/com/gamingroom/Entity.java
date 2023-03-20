/*
 * Marc Aradillas
 * Southern New Hampshire University
 * CS-230 Operating Platforms
 * 19 March, 2023
 * 
 */

package com.gamingroom;

/**
 * An entity class for required attributes
 * from UML diagram in resources guide and rubric
 * 
 * @author marc.aradillas@snhu.edu
 *
 */

public class Entity {

	protected long id; // instance variable added
	
	protected String name; // instance variable added
	
	protected Entity() {} // instance variable added
	
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public long getId() { // method 1 getId
		return id;
	}
	
	public String getName() { // method 2 getName
		return name;
	}
	
	// following convention used in provided classes for toString() method
	@Override
	public String toString() {
		// String interpolation using String.format()
		return "Entity [id = " + id + ", name = " + name + "]";
	}
}
