package java_basics;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 15;
		int y = 20;
		int z = 30;
		
		//boolean result1 = ++x < y && ++y < z && ++z > x; /*Not short circuit*/
		
		//boolean result1 = ++x < y && ++y > z && ++z > x; /*Short circuit*/
		
		boolean result2 = ++x < y || ++y < z || ++z > x; /*Or short circuit*/
		System.out.println(result2);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
//		boolean result1 = x < y && y > z;
//		System.out.println(result1);
//		
//		boolean result2 = x > y || y > z;
//		System.out.println(result2);
//		
//		boolean result3 = !(x > y);
//		System.out.println(result3);
	}

}
