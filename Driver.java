/*	SNHU IT 145
 *	5-4 Milestone: Menu Loop and Monkey Class
 *	Monkey.Java inherits from ResuceAnimal
 *	Student: Marc A. Aradillas
 *	2022
 *	
 *	TODO: Add Menu loop, create monkeyList ArrayList, and complete inTakeNewMonkey() Method.
 */

import java.util.ArrayList;
import java.util.Scanner;z

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) { 
    	Scanner scnr = new Scanner(System.in);
    	
    	String menuChoice = ""; //local variable
    	
        initializeDogList();
        initializeMonkeyList();
        
        
        // For the project submission you must also include input validation (not in this milestone)
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        	
        //start loop
        	displayMenu();
        	menuChoice = scnr.nextLine(); //get menu choice from user
        	
        	//Take appropriate action based on value user entered.
        	//Note:Switch block recommended
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
        			//TODO: take appropriate action for menu choice 3-run reserveAnimal() method
        			System.out.println("\n   -"
        					+ "reserveAnimal() method will be completed later in Project 2");
        		}
        		
        		else if(menuChoice.equals("4")) {
        			//TODO: take appropriate action for menu choice 4-run printAnimals() method
        			System.out.println("\n   -"
        					+ "printAnimals() method will be completed later in Project 2");
        		}
        		
        		else if(menuChoice.equals("5")) {
        			//TODO: take appropriate action for menu choice 5-run printAnimals() method
        			System.out.println("\n   -"
        					+ "printAnimals() method will be completed later in Project 2");
        		}
        		
        		else if(menuChoice.equals("6")) {
        			//TODO: take appropriate action for menu choice 4-run printAnimals() method
        			System.out.println("\n   -"
        					+ "printAnimals() method will be completed later in Project 2");
        		}
        		
        		else if(menuChoice.equals("q")){
        			System.out.println("You have exited the menu, goodbye!");
        		}
        		
        		else {
        			System.out.println("Enter a menu selection");
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
    	Monkey monkey1 = new Monkey("Guy", "Tamarin", "male", "1", "25.6", "05-12-2019", "United States", "intake", null, null, null, null, false, "United States");
        Monkey monkey2 = new Monkey("Dude", "Squirrel Monkeye", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", null, null, null, null, false, "United States");
        Monkey monkey3 = new Monkey("Bella", "Capuchin", "female", "4", "25.6", "12-12-2019", "Canada", "in service", null, null, null, null, true, "Canada");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
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
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scnr) {
        	
        	//Prompt and get monkey's name from user
            System.out.print("what is the new monkey's name?\n");
            String monkeyName = scnr.nextLine();
        
        	System.out.print("what is the new monkey's tail length?\n");
        	String tailLength = scnr.nextLine();
        	
        	System.out.print("what is the new monkey's height?\n");
        	scnr.nextLine();
        	
        	System.out.print("what is the new monkey's species?\n");
        	scnr.nextLine();

        	System.out.print("what is the new monkey's breed?\n");
        	scnr.nextLine();
        	
        	System.out.print("what is the new monkey's gender?\n");
        	scnr.nextLine();
        	
        	System.out.print("what is the new monkey's age?\n");
        	scnr.nextLine();
        	
        	System.out.print("what is the new monkey's weight?\n");
        	String weight = scnr.nextLine();
       
        	new Monkey(monkeyName, tailLength, "3", "tamarin", "primate", "male", "2", "25 pounds", null, null, null, weight, false, weight);
        	
        	System.out.println("New Monkey has been added!");
        }
        
        
        	
        	
        	
        	
        	
        	
        	
        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scnr) {
            System.out.println("The method reserveAnimal needs to be implemented");

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
        public static void printAnimals() {
            System.out.println("The method printAnimals needs to be implemented");

        }
}

