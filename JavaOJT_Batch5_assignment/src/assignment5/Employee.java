package assignment5;

public class Employee extends Person implements Schedule {
	
	public Employee(String name, Integer age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}


public Employee(String name, Integer age, String role, Double salary) {
	super(name, age);
	this.role = role;
	this.salary = salary;
}


private String role;
private Double salary;

	
	public String getRole() {
	return role;
}


public void setRole(String role) {
	this.role = role;
}


public Double getSalary() {
	return salary;
}


public void setSalary(Double salary) {
	this.salary = salary;
}


	@Override
	protected void uploadPerson() {
		// TODO Auto-generated method stub
		System.out.println(name+" is uploaded");
		
	}


	@Override
	public void startTimeUni() {
		// TODO Auto-generated method stub
		System.out.println(name+ "is start working");
	}


	@Override
	public void breakTime() {
		// TODO Auto-generated method stub
		System.out.println(name+ "is break");
	}


	@Override
	public void overTime() {
		// TODO Auto-generated method stub
		System.out.println(name+ "is  working overtime");
	}

}
