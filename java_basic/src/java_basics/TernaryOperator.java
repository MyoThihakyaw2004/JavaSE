package java_basics;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		int y = 15;
		int z = 30;
		
		int result1 = 0;
		int result2 = 0;
		
		System.out.println(((x > y) ? x : y) + ((y > z) ? y : z));
		
//		if (x > y) {
//			result1 = x;
//		} else {
//			result1 = y;
//		}
//		
//		if (y > z) {
//			result2 = y;
//		} else {
//			result2 = z;
//		}
		
//		System.out.println(result1 + result2);
	}

}
