package box_primitive;

public class BoxPrimitive {
	
	static void method1(Double d) {
		System.out.println("Inside Boxed Parameter method : "+d);
	}
	
	static void method2(double d) {
		System.out.println("Inside primitive Parameter method : "+d);
	}
	
	static void check(char test) {
		if(Character.isLetter(test)){
			System.out.println(test+" is a letter.");
		} else if(Character.isDigit(test)) {
			System.out.println(test+" is a digit.");
		} else {
			System.out.println(test+" is a symbol");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Character letter = 'G';
		check(letter);
		char nine = '9';
		check(nine);
		char dollar = '$';
		check(dollar);
		
//		double d = 3000.345;
//		method1(d);
//		
//		Double dObj = 4000.345;
//		method2(dObj);
		
//		System.out.println("bytes = "+Integer.BYTES);
//		System.out.println("Size = "+Integer.SIZE);
//		
//		System.out.println("bitCount = "+Integer.bitCount(3450));
//		System.out.println("Bit Pattern of 3450 = "+Integer.toBinaryString(3450));
//		System.out.println("Hex value = "+Integer.toHexString(3450));
//		System.out.println("Octal value = "+Integer.toOctalString(3450));
//
//		System.out.println(Integer.parseInt("100000"));
//		System.out.println(Integer.valueOf("50000"));
		
//		Integer intObj = new Integer(1000);
//		System.out.println("intObj = "+intObj);
//		
//		int a = 5000;
//		Integer intObj2 = new Integer(a);
//		System.out.println("intObj2 = "+intObj2);
//		
//		int b = intObj2.intValue();
//		byte d = intObj2.byteValue();
//		short e = intObj2.shortValue();
//		
//		System.out.println("b = "+b);
//		System.out.println("d = "+d);
//		System.out.println("e = "+e);
	}

}
