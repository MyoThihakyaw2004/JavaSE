package java_basics;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Enhanced For Loop
		String[] fruits = {"Apple", "Orange", "Banana", "Papaya", "Kiwi"};
		
		// Good Practice:
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
//		// Bad practice:
//		for (int i = 0; i < fruits.length; i++) {
//			System.out.println(fruits[i]);
//		}
		
		
//		System.out.println("### Prime Finder ###");
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("Enter width: ");
//		int width = userInput.nextInt();
//		System.out.println("Enter height: ");
//		int height = userInput.nextInt();
//		userInput.close();
//		
//		for(int j = 1; j <= height; j++) {
//			for (int i = 1; i <= width; i++) {
//				System.out.printf("%s ", "* "/*i*/);
//			}
//			System.out.println();
//		}

		// nested loop
//		System.out.println("### Prime Finder ###");
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("Enter an pattern: ");
//		int pattern = userInput.nextInt();
//		userInput.close();
//		
//		for(int j = 1; j <= pattern; j++) {
//			for (int i = 1; i <= pattern; i++) {
//				System.out.printf("%d ", j/*i*/);
//			}
//			System.out.println();
//		}

//		for(int j = 0; j < pattern; j++) {
//			for (int i = 0; i < pattern; i++) {
//				System.out.printf("%s ", "*");
//			}
//			System.out.println();
//		}
		
		
//		for (int i = 0; i < 4; i++) {
//			System.out.printf("%s ", "*");
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 4; i++) {
//			System.out.printf("%s ", "*");
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 4; i++) {
//			System.out.printf("%s ", "*");
//		}
//		System.out.println();
		
		// infinity loop
//		int i = 1;
//		for(;;) {
//			System.out.println(i++);
//		}
		
//		for (int i = 10000; i >= 10; i -= 10) {
//			System.out.println(i);
//		}
		
//		for (int i = 10; i <= 10000; i += 10) {
//			System.out.println(i);
//		}
		
		// 1 -> userInput
//		System.out.println("### Prime Finder ###");
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("Enter an integer: ");
//		int number = userInput.nextInt();
//		userInput.close();
//		
//		// 2 -> number / 1 to number -> count
//		int count = 0;
//		int loopTime = 0;
//		
//		for(int i = 1; i <= number; i++) {
//			loopTime++;
//			if (number % i == 0) {
//				count++;
//			}
//		}
//		
//		// 3 -> count == 2 ? prime : not prime // 4 -> output
//		System.out.println(count == 2 ? "prime number" : "not prime number");
//		System.out.printf("loop %d times%n", loopTime);
		
		
//		for(int i = 1; i <= 1000; i++) System.out.println(i);
		
//		int i = 1;
//		for(; i <= 1000; i++, System.out.println("i++ is worked")) System.out.println(i);
//		System.out.printf("final value of i = %d%n",i);

		
//		for(int i = 1; i <= 1500; i++) System.out.println("I Love You");
	
	}

}
