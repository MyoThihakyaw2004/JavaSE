package java_basics;

import java.util.Scanner;

public class Greet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = userInput.nextLine();
		userInput.close();
		
		System.out.println("Hello! "+ name);
	}

}
