package prevent_polymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(PasswordGenerator.generate(6));
		PasswordGenerator generator = new PasswordGenerator();/*Test();*/
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter strength: ");
		int strength = userInput.nextInt();
		userInput.close();
		
		System.out.println("Generated password : " + generator.generate(strength));
	}

}
