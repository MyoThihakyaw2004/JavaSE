package inheritance;

public class Developer extends ITEmployee {
	String developerCode;
	
	public Developer() {
		System.out.println("Inside Developer NoArgs Constructor");
	}
	
	void createDesign() {
		System.out.println(name + " is creating class designs");
	}
}
