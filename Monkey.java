//SNHU IT 145
//5-4 Milestone: Menu Loop and Monkey Class
//Monkey.Java inherits from ResuceAnimal
//Student: Marc A. Aradillas
//2022

public class Monkey extends RescueAnimal {
	
	//instance variables
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	private String breed;
	//TODO: declare variables for height, bodyLength, species, and breed
	
	//constructors
	
	// (default empty argument constructor not required for  5-4 milestone)
	public Monkey() {
		tailLength = "";
		//TODO: initialize height, bodyLength, species, and breed
	}
	
	//to score exemplary on this criterion
	//you must also include a more detailed constructor that takes
	//values for all Monkey's attributes and sets them.
	//Refer to the constructor in Dog Class for an example.
	
	//Accomplished: include parameters-arguments for height, bodyLength, species, and breed
	public Monkey(String name, String tailLength, String height, String bodyLength,
			String species, String breed, String gender, String age, String weight,
			String acquisitionDate, String acquisitionCountry, String trainingStatus,
			boolean reserved, String inServiceCountry) {
		setName(name);
		//Accomplished: create and call setTailLength() method
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setSpecies(species);
		setBreed(breed);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
		//Accomplished: create and call setters for height, bodyLength, species, and breed
	}

	public String getTailLength() {
		return tailLength;
	}

	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getBodyLength() {
		return bodyLength;
	}

	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	

	
	//Accessors (getter)Methods
	//TODO: create getters for all Monkey's attributes
	
	//Mutator (setter) Methods
	//TODO: create setters foir all Monkey's attributes
	
	
}
