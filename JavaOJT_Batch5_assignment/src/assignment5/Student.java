package assignment5;

public class Student extends Person implements Schedule{
String major;

	public Student(String name, Integer age, String major) {
	super(name, age);
	this.major = major;
}

	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public void startTimeUni() {
		// TODO Auto-generated method stub
		System.out.println(name+ "is start to go ");
	}

	@Override
	public void breakTime() {
		// TODO Auto-generated method stub
		System.out.println(name+ "is break");
	}

	@Override
	public void overTime() {
		// TODO Auto-generated method stub
		System.out.println(name+ "is learning overtime");
	}

	@Override
	protected void uploadPerson() {
		// TODO Auto-generated method stub
		System.out.println(name+"is upload. ");
	}

}
