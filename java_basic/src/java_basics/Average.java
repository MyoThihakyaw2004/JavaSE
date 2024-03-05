package java_basics;

import java.util.Scanner;

/**
 * This class calculates the average of 6 numbers
 * @author SwamYi
 */
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		double sum = 0;
		
		// Get user input for each number, and add it to the sum
//		System.out.print("1st Number: ");
//		sum += userInput.nextDouble();
//		
//		System.out.print("2nd Number: ");
//		sum += userInput.nextDouble();
//		
//		System.out.print("3rd Number: ");
//		sum += userInput.nextDouble();
//		
//		System.out.print("4th Number: ");
//		sum += userInput.nextDouble();
//		
//		System.out.print("5th Number: ");
//		sum += userInput.nextDouble();
//		
//		System.out.print("6th Number: ");
//		sum += userInput.nextDouble();
		
		for (int i = 1; i <= 6; i++) {
			System.out.println("Enter number "+i+"");
			sum += userInput.nextDouble();
		}
		
		userInput.close();
		
		// Calculate and print the average
		double average = sum/6;
		System.out.printf("The Average is %.2f", average);
	}

}
