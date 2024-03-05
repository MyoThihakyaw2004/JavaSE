package java_basics;

public class VarArgsMethod {
	
	static int infinityMultiply(int... numArray) {
		int result = 1;
		
		for (int element : numArray) {
			result *= element;
		}
		return result;
	}
	
	// Bad practice
//	static int infinityMultiply(int[] numArray) {
//		int result = 1;
//		
//		for (int element : numArray) {
//			result *= element;
//		}
//		return result;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {10, 20, 30};
		int[] array2 = {10, 20, 30, 40, 50};
		int[] array3 = {10, 20, 30, 11, 22, 33, 44};
		int[] emptyArray = {};
		
		System.out.println("array1 = "+infinityMultiply(array1));
		System.out.println("array2 = "+infinityMultiply(array2));
		System.out.println("array3 = "+infinityMultiply(array3));
		System.out.println("empty = " + infinityMultiply());
		System.out.println("10 * 4 = "+infinityMultiply(10, 4));
		System.out.println("5 * 6 * 7 = "+infinityMultiply(5, 6, 7));

	}

}
