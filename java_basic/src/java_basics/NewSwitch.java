package java_basics;

import java.util.Scanner;

public class NewSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number: 1 to 7");
		int day = userInput.nextInt();
		userInput.close();
		
		switch (day) {
		case 1,2,3,4,5 -> System.out.println("Sad Weekdays");
		case 6,7 -> System.out.println("Happy Weekends");
		default -> System.out.println("Invalid data");
		}
		
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("Enter operand1 :");
//		int operand1 = userInput.nextInt();
//		System.out.println("Enter operand2 :");
//		int operand2 = userInput.nextInt();
//		System.out.println("Enter operator : + - x / %");
//		char operator = userInput.next().charAt(0);
//		userInput.close();
//		
//		int result = switch (operator) {
//		case '+' -> operand1 + operand2;
//		case '-' -> operand1 - operand2;
//		case 'x' -> operand1 * operand2;
//		case '/' -> operand1 / operand2;
//		case '%' -> operand1 % operand2;
//		case '^' -> {
//			if (operand2 <= 4 && operand2 > 1) {
//				yield switch (operand2) {
//				case 2: {
//					yield (operand1 * operand1);
//				}
//				case 3: {
//					yield (operand1 * operand1 * operand1);
//				}
//				case 4: {
//					yield (operand1 * operand1 * operand1 * operand1);
//				}
//				default: {
//					yield 0;
//				}
//				};
//			} else {
//				yield 0;
//			}
//		}
//		default -> 0;
//		};
//		
////		double result = 0.0;
////		switch (operator) {
////		case '+':
////			result = operand1 + operand2;
////			break;
////		case '-':
////			result = operand1 - operand2;
////			break;
////		case 'x':
////			result = operand1 * operand2;
////			break;
////		case '/':
////			result = operand1 / operand2;
////			break;
////		case '%':
////			result = operand1 % operand2;
////			break;
////
////		default:
////			break;
////		}
//		
//		System.out.printf("%d %c %d = %d%n", operand1, operator, operand2, result);
	}

}
