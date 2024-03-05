package java_basics;

import java.util.Scanner;

public class ScientificCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("pi = " + Math.PI);
		System.out.println("e = " + Math.E);
		Scanner userInput = new Scanner(System.in);
		System.out.println("1. Two operand 2. One Operand");
		int operandDecision = userInput.nextInt();
		
		System.out.println("Enter Operand 1: ");
		double operand1 = userInput.nextDouble();
		
		switch (operandDecision) {
		case 1 -> {
			System.out.println("Enter Operand 2: ");
			double operand2 = userInput.nextDouble();
			System.out.println("1.add 2.sub 3.mul 4.mod 5.pow");
			int operation = userInput.nextInt();
			
			System.out.println("result is "+ calculateTwoOperand(operand1, operand2, operation));
		}
		case 2 -> {
			System.out.println("1.sin 2.cos 3.tan 4.asin 5.acos 6.atan 7.sinh 8.cosh 9.tanh 10.log10 11.ln 12.log x + 1 13.round 14.ceil 15.floor 16.sqrt 17.exp");
			int operation = userInput.nextInt();
			System.out.println("result is "+ calculateOneOperand(operand1, operation));
		}
		
		
		default -> System.out.println("Invalid Operation");
		}
		
		userInput.close();
		
	}
	
	static double calculateTwoOperand(double op1, double op2, int operation) {
		return switch (operation) {
		case 1 -> op1 + op2;
		case 2 -> op1 - op2;
		case 3 -> op1 * op2;
		case 4 -> op2 != 0 ? op1 / op2: 0.0;
		case 5 -> Math.pow(op1, op2);
		
		default -> 0.0;
		};
	}
	
	static double calculateOneOperand(double operand, int operation) {
		return switch (operation) {
		case 1 -> Math.toDegrees(Math.sin(operand));
		case 2 -> Math.cos(operand);
		case 3 -> Math.tan(operand);
		case 4 -> Math.asin(operand);
		case 5 -> Math.acos(operand);
		case 6 -> Math.atan(operand);
		case 7 -> Math.sinh(operand);
		case 8 -> Math.cosh(operand);
		case 9 -> Math.tanh(operand);
		case 10 -> Math.log10(operand);
		case 11 -> Math.log(operand);
		case 12 -> Math.log1p(operand);
		case 13 -> Math.round(operand);
		case 14 -> Math.ceil(operand);
		case 15 -> Math.floor(operand);
		case 16 -> Math.sqrt(operand);
		case 17 -> Math.exp(operand);
		
		default -> 0.0;
		};
	}

}
