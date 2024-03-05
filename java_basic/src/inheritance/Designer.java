package inheritance;

public class Designer extends ITEmployee {
	
	// Compiler will paste this code from the parent class
//	String name;
//	String role;
//	String email;
//	
//	void writeCode() {
//		System.out.println(name + " is writing code");
//	}
//	
//	void thinkAlgorithms() {
//		System.out.println(name + " is thinking is algorithm");
//	}
	
	String designerCode;
	
	public Designer() {
		super("Aung");
		System.out.println("Inside Designer NoArgs Constructor");
	}
	
	void createArt() {
		System.out.println(name + " is creating art");
	}
}
