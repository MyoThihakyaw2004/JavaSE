package assignment5;

import javax.security.auth.Subject;

public class Teacher extends Employee implements Schedule{
 String courseName;

	
	
	public Teacher(String name, Integer age, String role, Double salary, String courseName) {
	super(name, age, role, salary);
	this.courseName = courseName;
}

	public void teachCourse() {
				System.out.println(name+ " is teaching "+courseName);
	}

	@Override
	public void startTimeUni() {
		// TODO Auto-generated method stub
		System.out.println(name+" is start teaching");
	}

	@Override
	public void breakTime() {
		// TODO Auto-generated method stub
		System.out.println(name+ " is break");
	}

	@Override
	public void overTime() {
		// TODO Auto-generated method stub
		System.out.println(name+" is working overtime");
	}

}
