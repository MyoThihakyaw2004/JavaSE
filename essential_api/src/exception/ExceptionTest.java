package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
			int[] negativeArray = new int[-3];
			int[] array = new int[5];
			System.out.println(array[6]);
			System.out.println(100/0);
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticException is caught");
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIOB Exception is caught");
		} catch (NegativeArraySizeException ex) {
			System.out.println("Negative array exception is caught");
		}
		System.out.println("Other System Workings");
	}

}
