package week05;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create objects (instances of the Animal class) coming from the Animal class 
		//This class herein contains the main method
		
		//We use the constructor to set the information upon creation of the object
		
		Animal elephant = new Animal ("Dumbo", "elephant", 8000, 108, "Disneyland");
		
		//call on the describe method in the Animal class
		
		elephant.describe();
		
		System.out.println("\n\nLet's access individual fields:");
		System.out.println("-------------------------------");
		System.out.println("Our elephant is named: " + elephant.getName() + "."); //accessing the name of the elephant
		System.out.println(elephant.getName() + " weighs " + elephant.getWeight() + " lbs, and is " + elephant.getHeight() + " inches tall.");
		
		
		//Example: Create an Object with the Default Constructor
		//and use the Setters to store the information
		
		System.out.println("\n");
		
		Animal kangaroo = new Animal();
		
		kangaroo.setName("Jack");
		kangaroo.setType("Kangaroo");
		kangaroo.setWeight(150);
		kangaroo.setHeight(60);
		kangaroo.setLocation("Taronga Zoo");
		
		kangaroo.describe();
		
		//Accessing individual fields
		
		System.out.println("\n-------------------------------");
		System.out.println("Our " + kangaroo.getType() + " is named: " + kangaroo.getName() + "."); //accessing the name
		System.out.println(kangaroo.getName() + " weighs " + kangaroo.getWeight() + " lbs, and is " + kangaroo.getHeight() + " inches tall.");
		
		
		
		
		
		
		
				
				
				
				

	} //end of main

} //end of class/object
