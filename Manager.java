package week05;

public class Manager extends Employee {

	private double bonusPercentage;
	
	//constructor
	public Manager(String firstName, String lastName, double pay, String reportsTo, String address, double bonusPercentage) {
		super(firstName, lastName, pay, reportsTo, address);
		// TODO Auto-generated constructor stub
		this.bonusPercentage = bonusPercentage;
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return getPay() * 80 * (1 + bonusPercentage);
	}

}
