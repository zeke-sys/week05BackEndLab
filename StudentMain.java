package week05;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Building out the object (instance of the class Student) which inherits the properties of the class
		
		Student student1 = new Student(); //using the default Java constructor to instantiate. Only works if we consider the default in the main and/or a full constructor is not created
		
		student1.firstName = "Tom";
		student1.lastName = "Ridlle";
		student1.phoneNumber = "555-425-7452";
		student1.gradeLevel = 11;
		
		student1.introduce(); //calling on the describe method in the Student class to print the properties
		
		//creating student2 object and using overloaded constructor in the Student class
		
		Student student2 = new Student("Sammy", "Jones", "555-234-6781", 12); //passing in all the properties at the same time
		
		student2.introduce();
		
		
		
		

	} //end of main

} //end of class
