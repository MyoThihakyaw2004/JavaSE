package java_basics;

import java.util.Scanner;

/**
 * This class calculates the area of a circle
 * @author SwamYi
 */
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Get user input
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius = userInput.nextDouble();
		userInput.close();
		
		double pi = 3.1415926535;// Define pi
		
		if (radius <= 0) { /*Error check*/
			System.out.println("The radius must be greater than 0");
		} else {
			// Calculate and print the area of the circle
			double area = pi * (radius * radius);
			System.out.printf("The area of the circle is %.3f%n", area);
		}	
	}

}
