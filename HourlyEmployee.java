package week05;

public class HourlyEmployee extends Employee {

	private double hoursWorked;
	
	//constructor
	public HourlyEmployee(String firstName, String lastName, double pay, String reportsTo, String address, double hoursWorked) {
		super(firstName, lastName, pay, reportsTo, address); //super refers to the constructor in the Employee class, which every other class is inheriting from
		// TODO Auto-generated constructor stub
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return getPay() * hoursWorked;
	}

	
} //end of class
