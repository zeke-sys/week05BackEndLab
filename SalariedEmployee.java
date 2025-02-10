package week05;

public class SalariedEmployee extends Employee {

	public SalariedEmployee(String firstName, String lastName, String reportsTo, double pay, String address) {
		super(firstName, lastName, pay, reportsTo, address);
		// TODO Auto-generated constructor stub
	}

	@Override //Indicates that a method declaration is intended to override a method declaration in a supertype. 
	public double calculatePay() {
		// TODO Auto-generated method stub
		return getPay() * 80;
	}

	
} //end of class
