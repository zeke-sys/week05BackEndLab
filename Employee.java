package week05;

public abstract class Employee { //making it abstract means the class cannot be instantiated
	
	//Inheritance, Abstraction, and Polymorphism
	
	private String firstName;
	private String lastName;
	private double pay;
	private String address;
	private String reportsTo;
	
	//Constructor
	public Employee(String firstName, String lastName, double pay, String reportsTo, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pay = pay;
		this.address = address;
		this.reportsTo = reportsTo;
	}
	
	public abstract double calculatePay(); //no body to this because it'll have to be implemented by each other class that inherits it (perfect example of polymorphism)
	
	
	//public method - other classes will be able to pull from this
	public String getInformation() {
		return "Name: " + firstName + " " + lastName 
				+ "\nPayrate: " + pay
				+"\nReports to: " + reportsTo 
				+ "\nAddress: " + address;
	}
	
	
	
	//getters and setters since the variables are private (encapsulation)
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public double getPay() {
		return pay;
	}
	
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getReportsTo() {
		return reportsTo;
	}
	
	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}
	
	
	
	
	
	
	
	

} //end of class
