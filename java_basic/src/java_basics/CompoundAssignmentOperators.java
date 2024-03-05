package java_basics;

public class CompoundAssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 50;
		System.out.printf("Original x = %d%n", x);
		//x  = x + 50;
//		x += 50;
//		System.out.printf("added x = %d%n", x);
//		x -= 50;
//		System.out.printf("added x = %d%n", x);
//		x *= 50;
//		System.out.printf("added x = %d%n", x);
//		x /= 50;
//		System.out.printf("added x = %d%n", x);
		x %= 50;
		System.out.printf("added x = %d%n", x);
	}
}
