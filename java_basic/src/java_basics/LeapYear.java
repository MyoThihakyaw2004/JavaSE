package java_basics;

import java.util.Scanner;

/**
 * This class checks whether a year is a leap year or not.
 * @author SwamYi
 */
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Get user input for year
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter Year: ");
		int year = userInput.nextInt();
		userInput.close();
		
		if (year % 4 == 0) {/*If a year is evenly divisible by 4, it is a leap year */
			
			// If the year is a century year, it must also be divisible by 400
			if (year % 100 == 0 && year % 400 != 0) System.out.printf("%d is not a leap year", year);
			else System.out.printf("%d is a leap year", year);
			
		} else System.out.printf("%d is not a leap year", year);
		
		
		// First approach but the conditions are nested too many times??
		
//		if (year % 100 != 0) { /*For normal years*/
//			if (year % 4 == 0) System.out.printf("%d is a leap year", year);
//			else System.out.printf("%d is not a leap year", year);
//		} else { /*For century years*/
//			if (year % 400 == 0) System.out.printf("%d is a leap year", year);
//			else System.out.printf("%d is not a leap year", year);
//		}
	}

}
