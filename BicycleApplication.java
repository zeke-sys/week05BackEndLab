package week05;

public class BicycleApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicycle bike = new ACMEBicycle();
		
		bike.changeCadence(3);
		bike.changeGear(3);
		bike.speedUp(4);
		bike.applyBrakes(1);
		
		((ACMEBicycle) bike).printStates();
		
	
		
		
	} //end of main

} //end of class
