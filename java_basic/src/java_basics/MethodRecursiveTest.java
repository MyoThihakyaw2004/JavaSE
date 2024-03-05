package java_basics;

public class MethodRecursiveTest {

	// Bad practice
	static int factorial(int number) {
		if (number > 1) {
			return number * factorial(number - 1);
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("5! = " + factorial(5));
	}

}
