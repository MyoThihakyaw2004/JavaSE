package java_basics;
import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number: 1 to 7");
		int day = userInput.nextInt();
		userInput.close();
		
		// Should not use
		// Worst case scenario - 7 or invalid
		// High memory usage and memory is accessed many times
		if (day == 1) System.out.println("Sad Monday");
		else if (day == 2) System.out.println("Boring Tuesday");
		else if (day == 3) System.out.println("Active Wednesday");
		else if (day == 4) System.out.println("Hopeful Thursday");
		else if (day == 5) System.out.println("Happy Friday");
		else if (day == 6) System.out.println("Drinking Saturday");
		else if (day == 7) System.out.println("Sleeping Sunday");
		else System.out.println("Invalid data");
		
//		boolean nrc = false;
//		int age = 20;
//		
//		if (nrc && age >= 18) {
//			System.out.println("You can vote");
//		} else {
//			System.out.println("You cannot vote");
//		}
		
		//Nested if
//		if (nrc) {
//			System.out.println("Your NRC is checked");
//			if (age >= 18) {
//				System.out.println("You can vote");
//			} else {
//				System.out.println("You are underage");
//			}
//		} else {
//			System.out.println("You cannot vote");
//		}
		
//		if (x > 10) System.out.println("x is greater than 10");
//		if (x > 10) {
//			System.out.println("x is an integer");
//			System.out.println("x is greater than 10");
//		} else if (x == 10){
//			System.out.println("x is equal to 10");
//		} else System.out.println("x is less than 10");
//		
//		System.out.println("Out of if");
	}

}
