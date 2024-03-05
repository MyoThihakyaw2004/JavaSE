package inheritance;

public class Programmer extends ITEmployee {
	String programmerCode;
	Integer passCode = 2468;
	
	String test = "TestString Edited";
	
	public Programmer() {
		super();
		System.out.println("Inside Programmer NoArgs Constructor");
		System.out.println(passCode + "is the passcode");
		System.out.println("super's passcode: "+ super.passCode);
	}
	
	void testing() {
//		System.out.println(secret);
		System.out.println(name + " is testing");
	}
	
	void testString() {
		System.out.println(test);
		System.out.println(super.test);
		System.out.println(this.test);
	}
}
