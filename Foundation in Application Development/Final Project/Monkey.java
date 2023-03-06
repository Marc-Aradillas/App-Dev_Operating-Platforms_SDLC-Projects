/*	SNHU IT145
 *	7-1 Project Two Submission: Driver and Monkey Class
 *	Student: Marc A. Aradillas
 *	2022
 */

public class Monkey extends RescueAnimal {
	
	//Class Variables
	
	private double tailLength;
	private double height;
	private double bodyLength;
	private String species;
	
	
	// Constructor
	// made changes to variable types to reflect measurement with decimals
	
	public Monkey(String name, double tailLength, double height, double bodyLength,
			String species, String gender, String age, String weight,
			String acquisitionDate, String acquisitionCountry, String trainingStatus,
			boolean reserved, String inServiceCountry) {
		
		setName(name);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
		
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setSpecies(species);
	}

	public double getTailLength() {
		return tailLength;
	}

	public void setTailLength(double tailLength) {
		this.tailLength = tailLength;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBodyLength() {
		return bodyLength;
	}

	public void setBodyLength(double bodyLength) {
		this.bodyLength = bodyLength;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	
}
