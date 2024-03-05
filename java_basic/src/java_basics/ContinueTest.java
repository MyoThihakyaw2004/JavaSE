package java_basics;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 input -> String, char
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Your sentence : ");
		String inputtedSentence = userInput.nextLine();
		
		System.out.println("Enter Your char : ");
		char inputtedChar = userInput.next().charAt(0);
		userInput.close();
		
		int count = 0;
		for(int i = 0; i < inputtedSentence.length(); i++) {
			if (inputtedChar != inputtedSentence.charAt(i)) {
				continue;
			}
			count++;
		}
		
		System.out.println(inputtedChar+" is found "+count+ " times.");
		
//		int[] numbers = {10, 20, 30, 40, 50};
//		
//		for (int number: numbers) {
//			if (number == 30) {
//				continue;
//			}
//			System.out.println(number);
//		}
	}

}
