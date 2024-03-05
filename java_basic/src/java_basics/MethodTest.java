package java_basics;

public class MethodTest {
	
	static void addArray(int[] array) {
		int result = 0;
		
		for (int element : array) {
			result += element;
		}
		System.out.println("result = " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array1 = {20, 30, 40, 50, 60};
		addArray(array1);
//		int result = 0;
//		
//		for (int element : array1) {
//			result += element;
//		}
		
//		System.out.println("result = " + result);
	}

}
