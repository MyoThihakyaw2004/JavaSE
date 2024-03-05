package box_primitive;

public class PrimitiveVsBoxPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test with box primitive");
		long start = System.currentTimeMillis();
		long result = testWithBoxPrimitive();
		
		
//		long result = testWithPrimitive();
		System.out.println("result = "+ result);
		long totalElapsedTime = System.currentTimeMillis() - start;
		System.out.println("Tital Elapsed Time : "+totalElapsedTime+ " ms");/*1658 ms*/
	}

	static long testWithPrimitive() {
		long result = 0;
		for (long i = 1; i <= Integer.MAX_VALUE; i++) {
			result += i;
		}
		
		return result;
	}
	
	static Long testWithBoxPrimitive() {
		Long result = 0L;
		for (Long i = 1L; i <= Integer.MAX_VALUE; i++) {
			result += i;
		}
		
		return result;
	}
}
