package com.Java;

//Pet Class created. 
public class PetClass{
	//Attributes created for class with respective data type
	private String petType; //type of pet
	private String petName; // Pet name
	private int petAge; //age of pet with integer as data type
	private int dogSpace; //space available from 30 spaces for dogs
	private int catSpace; //space available from 12 spaces for cats... added for pet class versus dog class from week 2.
	private int daysStay; //pet stay in number of days
	private double amountDue; //amount due for boarding a dog/ cat + grooming
	
	//Constructor for attributes listed above, initializes values… edited my list of parameters for pet class
	public PetClass(String petType, String petName, int petAge, int dogSpace, int catSpace, int daysStay, double amountDue) {
		thi.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
		this.dogSpace = dogSpace;
		this.catSpace = catSpace;
		this.daysStay = daysStay;
		this.amountDue = amountDue;
	}	
	
	//Accessors and mutators for all attributes.

	public String getPetType() {
		return petType;
	}
	
	public void setPetType(String petType) {
		this.petType = petType;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public void setPetName(String petName) { 
		this.petName = petName;
	}
	
	public int getPetAge() {
		return petAge;
	}
	
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	
	public int getDogSpace() {
		return dogSpace;
	}
	
	public void setDogSpace(int dogSpace) {
		this.dogSpace = dogSpace;
	}

	public int getCatSpace() {
		return catSpace;
	}
	
	public void setCatSpace(int catSpace) {
		this.catSpace = catSpace;
	}
	
	public int getDaysStay() {
		return daysStay;
	}
	
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}
	
	public double amountDue() {
		return amountDue;
	}
	
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
	// getters and setters set with correct attribute and data types.
	
	public void print() {
		System.out.println(/*all variables*/);
	}
}
