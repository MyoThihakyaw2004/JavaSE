package final_modifier;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("### Client App ###");
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your username : ");
		String username = userInput.nextLine();
		System.out.println("Enter your password : ");
		String password = userInput.nextLine();
		userInput.close();
		
		final Authentication auth = FakeDatabase.authenticate(username, password);
		
		// HackZoe
//		Authentication fakeAuth = new Authentication("hackzoe", "999");
//		auth = fakeAuth;
		
		if(auth != null) {
			// HackZoe
			//if(auth.username.equals("HackZoe")) auth.premium = true;
			
			System.out.println("Welcome "+username);
			System.out.println("Login access granted");
			System.out.println(auth.premium ? "You can access Premium Features" : "You can access Normal Features");
		} else {
			System.out.println("Hello Stranger !!!");
			System.out.println("Login access is denied");
		}
	}

}
