package week05;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Week05ClassesAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Encapsulation: we encapsulate by using Access Modifiers: Public - accessible
		 * everywhere Private - only accessible within the class itself Protected -
		 * accessible within the class, other classes in the same package, and all
		 * subclasses No Modifier - same as protected, except not accessible in a
		 * subclass in different packages
		 */

		// Handling Exceptions in a code by
		// using a try catch statement

		try {
			FileReader fileReader = new FileReader("something.txt"); // attempting to find file using file name
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("Finally!");
		}

		System.out.println("After the try catch.");

		
		
		// INTERFACE

	

		
		
		
		
		
		

	} // end of main

} // end of class
