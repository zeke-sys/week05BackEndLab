package week05;

public class ACMEBicycle implements Bicycle {
	
	/*
	 * To implement the Bicycle interface, the name of the class would change (to a
	 * particular brand of bicycle, for example, such as ACMEBicycle), and you'd use
	 * the implements keyword in the class declaration
	 */

	int cadence = 0;
	int speed = 0;
	int gear = 1;

	// time to implement methods changeCadence, changeGear, speedUp,
	// and applyBrakes

	public void changeCadence(int newValue) {
		cadence = newValue;
		System.out.println("Cadence is " + cadence);
	}

	public void changeGear(int newValue) {
		gear = newValue;
		System.out.println("Gear is " + gear);
	}

	public void speedUp(int increment) {
		speed = speed + increment;
		System.out.println("Speed is " + speed);
	}

	public void applyBrakes(int decrement) {
		speed = speed - decrement;
		System.out.println("Once brakes are applied, speed decreases by " + decrement + ", and is now " + speed);
	}

	public void printStates() {
		System.out.println("\ncadence: " + cadence + " speed:" + speed + " gear:" + gear);
	}

	

	

} //end of interface
