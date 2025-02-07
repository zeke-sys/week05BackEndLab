package week05;

public class Rectangle {
	//encapsulating variables
	
	private double width;
	private double length;
	private double area;
	
	//constructor
	public Rectangle (double width, double length) {
		this.width = width;
		this.length = length;
		this.area = width * length;
	}
	
	//getters and setters
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
		area = width*length; //adding area so every time the width or length changes, the area is calculated
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
		area = length*width; //adding area so every time the width or length changes, the area is calculated
	}
	
	public double getArea() { //we only need the get area. We want to hide the details of the area
		return area;
	}
	
	//describe method
	public void describe() {
		System.out.println("The area of the rectangle is " + area + ".");
	}
	
	
	

} //end of class
