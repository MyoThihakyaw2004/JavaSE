package java_basics;

import java.util.Scanner;

/**
 * This class calculates the area of a trapezium
 * @author SwamYi
 */
public class TrapeziumArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		// Get user input for 2 parallel sides and height
		System.out.println("Enter the length of parallel sides");
		System.out.print("Enter side 1: ");
		double a = userInput.nextDouble();
		
		System.out.print("Enter side 2: ");
		double b = userInput.nextDouble();
		
		System.out.print("Enter height: ");
		double h = userInput.nextDouble();
		userInput.close();
		
		if (a <= 0 || b <= 0 || h <= 0) { /*Error check*/
			System.out.println("The numbers must be greater than 0");
		} else {
			// Calculate and print the area of the Trapezium
			double area = ((a+b)/2) * h;
			System.out.printf("Area of Trapezium is %.2f%n", area);
		}
	}

}
