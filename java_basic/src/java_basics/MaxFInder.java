package java_basics;

public class MaxFInder {

	int max (int num1, int num2) {
		System.out.println("Inside 2 int args method");
		return num1 > num2 ? num1 : num2;
	}
	
	int max(int... numbers) {
		System.out.println("Inside int varargs method");
		int max = numbers[0];
		
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
		}
		return max;
	}
	
	static void max() {
		System.out.println("MaxFinder is to find max value with many versions");
	}
	
	// Duplicate method
//	double max (int a, int b) {
//		return 0.0;
//	}
	
	double max(double num1, double num2, double num3) {
		System.out.println("Inside 3 double args method");
		double max = num1;
		
		if (num2 > max) {
			max = num2;
		}
		
		if (num3 > max) {
			max = num3;
		}
		return max;
	}
	
	String max(String s1, String s2) {
		System.out.println("Inside 2 Strings method");
		String max = "";
		
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == s2.charAt(i)) {
				continue;
			}
			
			if (s1.charAt(i) > s2.charAt(i)) {
				max = s1;
				break;
			} else {
				max = s2;
				break;
			}
		}
		return max;
	}
}
