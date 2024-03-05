package java_basics;

import java.util.Scanner;

/**
 * This class checks if an integer is even or odd
 * @author SwamYi
 */
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Get user input
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter an Integer: "); /*"even or odd" concept only applies to integers*/
		int num = userInput.nextInt();
		userInput.close();
		
		// If the number is evenly divisible by 2, it is an even number
		// Otherwise, it is an odd number
		if (num % 2 == 0) System.out.printf("%d is an even number %n", num);
		else System.out.printf("%d is an odd number %n", num); 
	}

}
