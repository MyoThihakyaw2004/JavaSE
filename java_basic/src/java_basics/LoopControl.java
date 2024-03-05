package java_basics;

import java.util.Scanner;

public class LoopControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Lucky draw program
		int[] luckyNumber = {22, 45, 89, 14, 11, 99, 78, 54, 41, 33};
		
		Scanner userInput = new Scanner(System.in);
		while (true) {
			
			System.out.println("Enter your number : ");
			int myNumber = userInput.nextInt();
			
			boolean found = false;
			int index = -1;
			
			int count = 0;
			for (int i = 0; i < luckyNumber.length; i++) {
				count++;
				if (myNumber == luckyNumber[i]) {
					found = true;
					index = i;
					break;
				}
			}
			
			String result = found ? myNumber+" is found at index-"+index :
				myNumber+ " is not found";
			System.out.println(result);
			System.out.println("loop " + count + " times");
			
			System.out.println("continue? yes-y or no-n");
			char decision = userInput.next().charAt(0);
			if (decision == 'n') {
				userInput.close();
				break; 
			}
			
		}
		
		System.out.println("Program is terminated");
	}

}
