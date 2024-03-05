package assignment3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		double number = 0;
		
		do {
			System.out.print("Enter a positive integer : ");
			number = userInput.nextDouble();
		} while (number <= 0 || number % 1 > 0);
		
		userInput.close();
		
		double result = number;
		for (double operand = number - 1; operand > 1; result *= operand--);
		
		System.out.println("Factorial of " + number + " : " + result);
	}

}
