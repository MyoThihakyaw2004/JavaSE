package java_basics;

public class VariableScope {
	
	static int a = 10000;
	static int b; // default 0
	static double c; // 0.0
	static boolean d; // false
	static Car car;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(car);
		
		// Null pointer
		System.out.println(car.brand);
		car.horn();
		
		int x = 100;
		
		if(true) {
			int y = 150;
			System.out.println(y);
			System.out.println(a);
		}
		
		if(true) {
			int y = 200;
			System.out.println(y);
		}
		
		//System.out.println(y);
//		System.out.println(x);
//		System.out.println(z);
	}

	static void test() {
		System.out.println(a);
	}
}
