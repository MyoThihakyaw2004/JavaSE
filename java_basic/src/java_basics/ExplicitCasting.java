package java_basics;

public class ExplicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Out of range cases
		
		//int val1 = 120; /*No data loss*/
//		int val1 = 2000000; /*Data loss*/
//		byte val2 = (byte)val1;
//		System.out.println(val1);
//		System.out.println(val2);
		
		//Truncation - cut off
//		double v1 = 100.3456;
//		int v2 = (int)v1;
//		System.out.println(v1);
//		System.out.println(v2);
		
		//Special case
		byte v1 = 118;
		char v2 = (char)v1; // byte -> int int -> char
		System.out.println(v1);
		System.out.println(v2);
		
	}

}
