package java_basics;

/**
 * This class is for testing integer values
 * We will test byte, short, int, long, char
 * @author SwamYi
 * @since 2.1
 */
public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char char1 = 66;
		char char2 = 'u';
		char char3 = '9';
		char char4 = '&';
		char unicode = '\uFA10';
		System.out.println(char1);
		System.out.println(char2);
		System.out.println(char3);
		System.out.println(char4);
		System.out.println(unicode);
		
		//Test long variable
		long longVal = 23_000_000_000L;
		long longVal1 = -2223_000_000_000L;
		long longVal2 = 1239721109793202173L;
		long longMax = Long.MAX_VALUE; /*9.2 * 10^18*/
		long longMin = Long.MIN_VALUE;
		//System.out.println(longVal);
		//System.out.println(longVal1);
		System.out.println(longMax);
		System.out.println(longMin);
		
		//Test int variable
		int intVal = 35000000;
		int intVal1 = -2_000_000_000;
		//int intVal2 = 23_000_000_000;
		int intMax = Integer.MAX_VALUE;
		int intMin = Integer.MIN_VALUE;
		//System.out.println(intVal);
		//System.out.println(intVal1);
		System.out.println(intMax);
		System.out.println(intMin);
		
		//Test short variable
		short shortVal = 27000;
		short shortVal2 = -30000;
		short shortMax = Short.MAX_VALUE;
		short shortMin = Short.MIN_VALUE;
		//System.out.println(shortVal);
		//System.out.println(shortVal2);
		System.out.println(shortMax);
		System.out.println(shortMin);
		
		//test byte variable
		byte byteVal;
		byteVal = -120;
		byte byteVal2 = 127;
		//byte byteVal3 = 300;
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
//		
		//Short comment test
		//System.out.println(byteVal/*byteVal3*/);
		//System.out.println(byteVal2);
		System.out.println(maxByte);
		System.out.println(minByte);
		
	}

}
