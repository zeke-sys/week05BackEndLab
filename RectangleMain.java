package week05;

public class RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rec = new Rectangle(5, 10);
		
		//calling on the describe method
		rec.describe();
		
		//changing the length of the rectangle (encapsulation)
		rec.setLength(12);
		rec.describe();
		

	} //end of main

} //end of class
