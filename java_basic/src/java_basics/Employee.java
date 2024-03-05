package java_basics;

public class Employee {

	long id;
	String name;
	String email;
	String role;
	double salary;
	
	Employee() {
		System.out.println("Inside Employee no args constructor.");
	}
	
	Employee(long id) {
		System.out.println("Inside Employee 1 args Constructor");
		this.id = id;
	}
	
	Employee(String email, String role) {
		System.out.println("Inside Employee 2 args constructor");
		
		this.email = email;
		this.role = role;
	}
	
	Employee(long id, String name, String email, 
			String role, double salary) {
		this(email, role);
		System.out.println("Inside Employee All Arguments Constructor");
		
		this.id = id;
		this.name = name;
//		this.email = email;
//		this.role = role;
		this.salary = salary;
	}
	
	static void description() {
		System.out.println("This class is blueprint for employee object");
	}
	
	void method1() {
		System.out.println("Inside Method1");
	}
	
	void method2() {
		description();
		this.method1();
	}
	
	void update(long id, String name, String email, 
			String role, double salary) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.salary = salary;
	}
}
