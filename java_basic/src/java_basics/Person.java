package java_basics;

public class Person {
	long id;
	String name;
	String gender;
	String job;
	int age;
	
	Person(long newId, String newName, int newAge, String newGender, String newJob) {
		id = newId;
		name = newName;
		age = newAge;
		gender = newGender;
		job = newJob;
	}
	
	void greet() {
		System.out.println("Hello! My name is "+ name);
		System.out.println("Nice to meet you");
	}
	
	void study() {
		System.out.println(name + " is studying");
	}
	
	void goToJob() {
		System.out.println(name + " is going to job");
	}
	
	void information() {
		System.out.println("Id: "+ id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Job : " + job);
	}
}
