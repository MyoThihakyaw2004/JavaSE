package java_basics;

import java.util.Scanner;

/**
 * This class calculates the area of a triangle
 * @author SwamYi
 */
public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Get user input for height
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter Height: ");
		double height = userInput.nextDouble();
		
		// Get user input for base
		System.out.print("Enter Base: ");
		double base = userInput.nextDouble();
		userInput.close();
		
		// Error check. Don't accept numbers less than 0.
		if (height <= 0 || base <= 0) { 
			System.out.println("The numbers must be greater than zero");
		} else {
			// Calculate area and print
			double area = (base * height) / 2;
			System.out.printf("The area of the triangle: %.2f", area);
		}
	}

}
