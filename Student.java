package week05;

public class Student {
	
	//creating properties for the Student class
	
	static int numberOfStudents;
	
	String firstName;
	String lastName;
	String phoneNumber;
	int gradeLevel;
	
	public Student() {} //This allows us to use the default new Student Java constructor in the main, if needed
	
	//creating an overloaded constructor with all the properties above so we don't have to use the default constructor
	public Student (String firstName, String lastName, String phoneNumber, int gradeLevel) {
		this.firstName = firstName; //using this so Java knows we're talking about the current user entry and so it can be stored
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel;		
	}
	
	
	
	public void introduce() {
		System.out.println("\nHello, my name is " + firstName + " " + lastName + ".");
		System.out.println("I am in grade " + gradeLevel + ".");
		System.out.println("My phone number is " + phoneNumber + ".");
	}
	
	
	

} //end of class
