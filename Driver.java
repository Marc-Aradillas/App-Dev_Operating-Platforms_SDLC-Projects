/*	SNHU IT145
 *	7-1 Project Two Submission: Driver and Monkey Class
 *	Student: Marc A. Aradillas
 *	2022
 *	
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    

    public static void main(String[] args) { 
    	Scanner scnr = new Scanner(System.in);
    	
    	String menuChoice;
    	
        initializeDogList();
        initializeMonkeyList();
        
        
        // For the project submission you must also include input validation (not in this milestone)
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        	
        //start loop
        while (true) {
        	displayMenu();
        	menuChoice = scnr.nextLine(); //get menu choice from user
        	
        	//Take appropriate action based on value user entered.
        		if(menuChoice.equals("1")) {
        			//menu choice 1 - run intakeNewDog() method
        			intakeNewDog(scnr);
        			System.out.println("\n   -"
        					+ "intakeNewDog() method will be completed later in Project 2");
        		}
        		else if(menuChoice.equals("2")) {
        			intakeNewMonkey(scnr); //run intakeNewMonkey method
        		}
        		
        		else if(menuChoice.equals("3")) {
        			reserveAnimal(scnr);
        		}
        		
        		else if(menuChoice.equals("4")) {
        			printAnimals("dog");
        		}
        		
        		else if(menuChoice.equals("5")) {
        			printAnimals("monkey");
        		}
        		
        		else if(menuChoice.equals("6")) {
        			printAnimals("available");
        		}
        		
        		else if(menuChoice.equals("q")){
        			System.out.println("You have exited the menu, goodbye!");
        		}
        		
        		else {
        			System.out.println("Invalid, Enter a menu selection");
        		}
        }
        		
    }


    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Elias", 3.2, 10, 4.5, "Tamarin", "female", "15", "1", "06-20-2021", "United States", "in service", true, "United States");
        Monkey monkey2 = new Monkey("Benito", 3.4, 9.8, 4.7, "Tamarin", "female", "15", "1", "06-20-2021", "United States", "in service", true, "United States");
        Monkey monkey3 = new Monkey("Jupta", 3.1, 9.3, 4.2, "Tamarin", "female", "15", "1", "06-20-2021", "United States", "in service", true, "United States");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }


    // Complete the intakeNewDog method
    // 
    public static void intakeNewDog(Scanner scnr) {
        System.out.println("What is the dog's name?");
        String name = scnr.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        
        System.out.println("Breed: ");
        String breed = scnr.nextLine();
        
        System.out.println("Gender (male/female): ");
        String gender = scnr.nextLine();
        
        System.out.println("Age (in years): ");
        String age = scnr.nextLine();
        
        System.out.println("Weight: ");
        String weight = scnr.nextLine();
        
        System.out.println("Acquisition date: ");
        String acqDate = scnr.nextLine();
        
        System.out.println("Acquisition country: ");
        String country1 = scnr.nextLine();
        
        System.out.println("Training status: ");
        String status = scnr.nextLine();
        
        System.out.println("Reserved (1 for true, 0 for false): ");
        String choice = scnr.nextLine();
        
        boolean reserved;
        
        if(choice.equals("1"))
            reserved = true;
        
        else
            reserved = false;
        
        System.out.println("In service country: ");
        String country2 = scnr.nextLine();
        
        Dog newDog = new Dog(name, breed, gender, age, weight, acqDate, country1, status, reserved, country2);
        dogList.add(newDog);
    }

    
    // Complete intakeNewMonkey
	// Instantiate and add the new monkey to the appropriate list
    
        public static void intakeNewMonkey(Scanner scnr) {
        	
        	//Prompt and get monkey's name from user
            System.out.println("what is the new monkey's name?\n");
            String monkeyName = scnr.nextLine();
            
            for(Monkey monkey: monkeyList){
            	// user input validation
            	// ignore letter case for user input; .equalsIgnoreCase()
            	if(monkey.getName().equalsIgnoreCase(monkeyName)) {
            		System.out.println("\n\nThis Monkey is already in our system\n\n");
            		return; //returns to menu options
            	}
            }
        
        	System.out.println("what is the new monkey's tail length?\n");
        	double tailLength = scnr.nextDouble();
        	
        	System.out.println("what is the new monkey's height?\n");
        	double height = scnr.nextDouble();
        	
        	System.out.println("what is the new monkey's body length?\n");
        	double bodyLength = scnr.nextDouble();
        	
        	System.out.println("what is the new monkey's species?\n");
        	String species = scnr.nextLine();
        	
        	System.out.println("what is the new monkey's gender?\n");
        	String gender = scnr.nextLine();
        	
        	System.out.println("what is the new monkey's age?\n");
        	String age = scnr.nextLine();
        	
        	System.out.println("what is the new monkey's weight?\n");
        	String weight = scnr.nextLine();
        	
        	System.out.println("what is the acquisition date?\n ");
            String acqDate = scnr.nextLine();
            
            System.out.println("what is the acquisition country?\n");
            String country1 = scnr.nextLine();
            
            System.out.println("current training status?\n");
            String status = scnr.nextLine();
            
            System.out.println("Reserved (1 for true, 0 for false): ");
            String choice = scnr.nextLine();
            
            //choice set to prompt user for true or false
            
            boolean reserved;
            
            if(choice.equals("1"))
            	reserved = true;
            
            else
            	reserved = false;
            
            System.out.println("in service country: ");
            String country2 = scnr.nextLine();
                   	
        	
       
        	Monkey monkey = new Monkey(monkeyName, tailLength, height, bodyLength, species, gender,
        			age, weight, acqDate, country1, status, reserved, country2);
        	
        	System.out.println("New Monkey has been added!");
        }
        

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        
        public static void reserveAnimal(Scanner scnr) {
            System.out.println("Dog or Monkey: ");
            String input = scnr.nextLine();
            
            System.out.println("Service country: ");
            String serviceCountry = scnr.nextLine();
            
            // flag to check condition is true
            if(input.equalsIgnoreCase("dog")) {
                int flag = 0;
                
                for(Dog dog: dogList) {
                    if(dog.getInServiceLocation().equalsIgnoreCase(serviceCountry)) {
                    	
                        if(! dog.getReserved()){
                            dog.setReserved(true);
                            System.out.println("Dog " + dog.getName() + " is now reserved");
                            flag = 1;
                            break;
                        }
                    }
                }
                
                if(flag ==0)
                    System.out.println("No Dogs found to reserve");
            }
            
            else if (input.equalsIgnoreCase("monkey")) {
                int flag = 0;
                
                for(Monkey monkey : monkeyList) {
                	
                    if(monkey.getInServiceLocation().equalsIgnoreCase(serviceCountry)) {
                    	
                        if(! monkey.getReserved()) {
                            monkey.setReserved(true);
                            System.out.println("Monkey " + monkey.getName() + " is now reserved");
                            flag = 1;
                            break;
                        }
                    }
                }
                
                if(flag ==0)
                    System.out.println("No Monkey found to reserve");
            }
            
            else {
                System.out.println("Wrong animal type");
            }
        }

        
        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
		// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
		// Remember that you only have to fully implement ONE of these lists. 
		// The other lists can have a print statement saying "This option needs to be implemented".
		// To score "exemplary" you must correctly implement the "available" list.
        
        
        public static void printAnimals(String listType) 
        {
            if(listType.equalsIgnoreCase("dog"))
            {
                for(Dog dog: dogList) //dog list
                {
                    System.out.println("\nDog " + dog.getName() + " Gender: " + dog.getGender() 
                            + " Age: " + dog.getAge() + " Weight: " + dog.getWeight()
                            + "\nAcquisition Date: " + dog.getAcquisitionDate() 
                            + "\nAcquisition Country: " + dog.getAcquisitionLocation() 
                            + "\nReserved: " + dog.getReserved() + "\nTraining Status: " 
                            + dog.getTrainingStatus() + "\nService country: " + dog.getInServiceLocation());
                    
                }
            }
            else if(listType.equalsIgnoreCase("monkey"))
            {
                for(Monkey monkey: monkeyList) //monkey list
                {
                    System.out.println("\nMonkey " + monkey.getName() + " Gender: " + monkey.getGender() 
                            + " Age: " + monkey.getAge() + " Weight: " + monkey.getWeight()
                            + "\nSpecies: " + monkey.getSpecies() + " Tails Length: " + monkey.getTailLength()
                            + " Height: "+ monkey.getHeight() + "  Body Length: " + monkey.getBodyLength()
                            + "\nAcquisition Date: " + monkey.getAcquisitionDate() 
                            + "\nAcquisition Country: " + monkey.getAcquisitionLocation() 
                            + "\nReserved: " + monkey.getReserved() + "\nTraining Status: " 
                            + monkey.getTrainingStatus() + "\nService country: " + monkey.getInServiceLocation());
                }
            }
            else if(listType.equalsIgnoreCase("available"))
            {
                for(Dog dog: dogList) //dog list 
                {
                    if( dog.getTrainingStatus().equalsIgnoreCase("in service") && (! dog.getReserved()))
                    {
                        System.out.println("\nDog " + dog.getName() + " Gender: " + dog.getGender() 
                            + " Age: " + dog.getAge() + " Weight: " + dog.getWeight()
                            + "\nAcquisition Date: " + dog.getAcquisitionDate() 
                            + "\nAcquisition Country: " + dog.getAcquisitionLocation() 
                            + "\nReserved: " + dog.getReserved() + "\nTraining Status: " 
                            + dog.getTrainingStatus() + "\nService country: " + dog.getInServiceLocation());
                    }
                }
                
                for(Monkey monkey : monkeyList) //monkey list
                {
                    if(monkey.getTrainingStatus().equalsIgnoreCase("in service") && (! monkey.getReserved()))
                    {
                        System.out.println("\nMonkey " + monkey.getName() + " Gender: " + monkey.getGender() 
                            + " Age: " + monkey.getAge() + " Weight: " + monkey.getWeight()
                            + "\nSpecies: " + monkey.getSpecies() + " Tails Length: " + monkey.getTailLength()
                            + " Height: "+ monkey.getHeight() + "  Body Length: " + monkey.getBodyLength()
                            + "\nAcquisition Date: " + monkey.getAcquisitionDate() 
                            + "\nAcquisition Country: " + monkey.getAcquisitionLocation() 
                            + "\nReserved: " + monkey.getReserved() + "\nTraining Status: " 
                            + monkey.getTrainingStatus() + "\nService country: " + monkey.getInServiceLocation());
                    }
                }
            }
            else
            {
                System.out.println("Wrong list type");
            }
        }
    }
