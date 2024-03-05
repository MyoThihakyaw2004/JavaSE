package java_basics;

import java.util.Scanner;

/**
 * This class swaps 2 variables without a third one
 * @author SwamYi
 */
public class VariableSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		// Get user input for 2 variables
		System.out.print("Enter 1st Number: ");
		int num1 = userInput.nextInt();
		System.out.print("Enter 2nd Number: ");
		int num2 = userInput.nextInt();
		userInput.close();
		
		System.out.printf("Original numbers: num1 = %d, num2 = %d%n", num1, num2); /*Print original numbers*/
		
		// num2 is added to num1, num1 now contains the sum
		num1 = num1 + num2;
		
		// num2 is subtracted from the sum(num1) to get original num1
		// original num1 is then assigned to num2 variable
		num2 = num1 - num2; 
		
		// the original num1(currently assigned to num2) is subtracted from the sum(num1) to get original num2
		// original num2 is then assigned to num1 variable.
		num1 = num1 - num2;
		
		System.out.printf("Swapped numbers: num1 = %d, num2 = %d%n", num1, num2);/*Print swapped numbers*/
	}

}
