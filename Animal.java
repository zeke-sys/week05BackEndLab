package week05;

public class Animal { //class is created is written in pascal case (not camel case)
	
	//this class has two constructors - getters, setters, and a describe() method
	
	private String name; //we add the access modifier private here b/c we only want it to be accessed within the class itself
	private String type; //with an access modifier like private, we then have to use getters and setters to access the data
	private double weight;
	private double height;
	private String location;
	
	public Animal() {} //adding this to use the default Java constructor Animal() method, if needed in the main
	
	//Adding this constructor so we don't have to create it in the main and so it's reusable 
	public Animal(String name, String type, double weight, double height, String location) {
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.height = height;
		this.location = location;
		
	}
	
	//getters and setters - we use these not only to access the data but we could use methods that validate the data that gets inputed as well
	public String getName() {
		return name;
	}
	
	public void setName(String name) { //using a method where we check the length of the name so it's valid (see below for method)
		if (checkLength(name, 1)) {
			this.name = name;
		}
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		if (checkLength(type, 1)) {
		this.type = type;
		}
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
			this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
			this.height = height;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		if (checkLength(location, 1)) {
			this.location = location;
		}
	}
	
	//private methods
	//1
	private boolean checkLength(String str, int length) {
		return str.length() > length;
	}
	
	
	
	//public methods
	//describe method
	
	public void describe() {
		System.out.println("Animal Description");
		System.out.println("------------------");
		System.out.println("\tName: " + name);
		System.out.println("\tType: " + type);
		System.out.println("\tWeight: " + weight);
		System.out.println("\tHeight: " + height);
		System.out.println("\tLocation: " + location);
	}
	
	
	
	

} //end of class
