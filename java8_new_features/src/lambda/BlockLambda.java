package lambda;

public class BlockLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testable leapYear = y -> {
			if(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
				return true;
			} else {
				return false;
			}
		};
		
		long test = 2024;
		System.out.println(leapYear.test(test) ? "Leap year" : "Not leap year");
		
//		Testable factorial = n -> {
//			if (n <= 20) {
//				long result = 1;
//				for (int i = 2; i <= n; i++) {
//					result *= i;
//				}
//				System.out.println("Factorial of "+n+" = "+result);
//				return true;
//			} else {
//				return false;
//			}
//		};
//		
//		if (factorial.test(24)) {
//			System.out.println("Your number can be factorial");
//		} else {
//			System.out.println("Your number cannot be factorial");
//		}

	}
}
