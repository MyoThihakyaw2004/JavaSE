package assignment3;

import java.util.Scanner;

public class FactoricalCalculator{

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number to find its factorial: ");
	        int number = scanner.nextInt();

	        if (number < 0) {
	            System.out.println("Please enter a non-negative number.");
	        } else {
	            long factorial = 1;
	            for (int i = 1; i <= number; i++) {
	                factorial *= i;
	            }
	            System.out.println("Factorial of " + number + " is: " + factorial);
	        }
	    }
	}


