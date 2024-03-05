package java_basics;

public class Calculator {
	
	double operand1;
	double operand2;
	
	static void description() {
		System.out.println("This class is blueprint for calculator object");
	}
	
	
	double operate(char operator) {
		return switch (operator) {
		case '+' -> add();
		case '-' -> subtract();
		case '*' -> multiply();
		case '/' -> divide();
		case '%' -> modulus();
		
		
		default -> 0.0;
		};
	}
	
	double add() {
		return operand1 + operand2;
	}
	
	double subtract() {
		return operand1 - operand2;
	}
	
	double multiply() {
		return operand1 * operand2;
	}
	
	double divide() {
		return operand2 != 0 ? operand1 / operand2 : 0.0;
	}
	
	double modulus() {
		return operand1 % operand2;
	}
	
}
