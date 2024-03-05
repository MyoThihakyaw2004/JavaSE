package java_basics;

public class MethodAccess {
	
	int instanceVar = 10000;
	static int staticVar = 50000;
	
	static void staticMethod() {
		System.out.println("Inside staticMethod");
	}
	
	void instanceMethod() {
		System.out.println("Inside instance method");
	}
	
	static void testReturn(int value) {
		if (value > 100) {
			return;
		}
		System.out.println("Other statement of this method");
	}

	public static void main(String[] args) {
		
		testReturn(120);
		// TODO Auto-generated method stub
//		MethodAccess methodAccess = new MethodAccess();
//		
//		System.out.println(methodAccess.instanceVar);
//		methodAccess.instanceMethod();
//		
//		System.out.println(staticVar);
//		staticMethod();
	}

}
