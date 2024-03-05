package java_basics;

import java.util.Scanner;

public class OldSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number: 1 to 7");
		int day = userInput.nextInt();
		userInput.close();
		
		// Case grouping
		switch (day) {
		case 1: case 2: case 3: case 4: case 5:
			System.out.println("Sad Weekdays");
			
			break;
		case 6: case 7:
			System.out.println("Happy Weekends");
			break;
		default:
			System.out.println("Invalid data");
			break;
		}
		
//		switch(day) {
//			case 1 : System.out.println("Sad Monday");
//			break;
//			case 2 : System.out.println("Boring Tuesday");
//			break;
//			case 3 : System.out.println("Active Wednesday");
//			break;
//			case 4 : System.out.println("Hopeful Thursday");
//			break;
//			case 5 : System.out.println("Happy Friday");
//			break;
//			case 6 : System.out.println("Drinking Saturday");
//			break;
//			case 7 : System.out.println("Sleeping Sunday");
//			break;
//			default : System.out.println("Invalid data");
//			break;
//		
//		}
		
		System.out.println("Out of switch");
	}

}
