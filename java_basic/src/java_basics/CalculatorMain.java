package java_basics;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("1.calculate 2.description");
		int operation = userInput.nextInt();
		
		switch (operation) {
		case 1 -> {
			Calculator calculator = new Calculator();
			System.out.println("Enter operand1 : ");
			calculator.operand1 = userInput.nextDouble();
			System.out.println("Enter operand2 : ");
			calculator.operand2 = userInput.nextDouble();
			System.out.println("Enter operator : ");
			char operator = userInput.next().charAt(0);
			userInput.close();
			
			System.out.println((calculator.operand1)+" "+operator+" "+(calculator.operand2)+" = "+calculator.operate(operator));
		}
		case 2 -> Calculator.description();
		
		
		default -> System.out.println("Invalid Operation");
		}
		
		
		Calculator cal = new Calculator();
	}

}
