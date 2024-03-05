package inheritance;

public class ITEmployee {
	protected String name;
	String role;
	String email;
	String test = "TestString";
	private String secret;
	protected Integer passCode = 1122;
	
	public ITEmployee() {
		System.out.println("Inside ITEmployee NoArgs Constructor");
	}
	
	public ITEmployee(String name) {
		this.name = name;
	}
	
	void writeCode() {
		System.out.println(name + " is writing code");
	}
	
	void thinkAlgorithms() {
		System.out.println(name + " is thinking is algorithm");
	}
}
