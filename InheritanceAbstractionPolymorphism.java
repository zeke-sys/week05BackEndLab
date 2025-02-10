package week05;

public class InheritanceAbstractionPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee salary = new SalariedEmployee("Tom", "Sawyer", "Candace Sloane", 250.00, "123 Strawberry Ln");
		Employee hourly = new HourlyEmployee("Tim", "Smith", 15.00, "Mary Swain", "545 Blueberry St", 75.5);
		Employee manager = new Manager("Rob", "Lincoln", 450.00, "Todd Waltz", "1532 Raspberry Pl", 0.15);
		
		//Get information on employees
		
		System.out.println("-Salaried-\n" + salary.getInformation());
		
		System.out.println("\n-Hourly-\n" + hourly.getInformation());
		
		System.out.println("\n-Manager-\n" + manager.getInformation());
		
		System.out.println("\n-----------------------");
		
		System.out.println("Go Eagles!");
		
		//Printing out the salaries for the 3 different types of employee
		//Salaried
		System.out.println("\n- " + salary.getFirstName() + " " + salary.getLastName() 
		+ " is a salaried employee, and makes " + salary.calculatePay() + " in salary a week.");
		
		//Hourly
		System.out.println("\n- " + hourly.getFirstName() + " " + hourly.getLastName() 
		+ " is an hourly employee, and makes " + hourly.calculatePay() + " in salary a week.");
		
		//Manager
		System.out.println("\n- " + manager.getFirstName() + " " + manager.getLastName() 
		+ " is a manager, and makes " + manager.calculatePay() + " in salary a week.");
		
		
		
		

	} //end of main

} //end of class
