package java_basics;

public class Cat {

	String name;
	String breed;
	String sex;
	String color;
	int age;
	
	Cat(String newName, String newBreed, String newSex, String newColor, int newAge) {
		name = newName;
		breed = newBreed;
		sex = newSex;
		color = newColor;
		age = newAge;
	}
	
	// Method overloading
	void meow() {
		System.out.println("Meow");
	}
	
	void meow(int count) {
		for (int i = 0; i < count; i++) {
			meow();
		}
		System.out.println();
	}
	
	void hunt() {
		System.out.println(name + " is hunting.");
		System.out.println(name + "caught a mouse");
	}
	
	void play() {
		System.out.println(name + " is playing with its favorite toy");
	}
	
	void stepOnKeyboard() {
		System.out.println(name + " is pressing random keys alfjeoawbfoawfh");
	}
	
	void information() {
		System.out.println("Name: " + name);
		System.out.println("Breed: " + breed);
		System.out.println("Sex: "+ sex);
		System.out.println("Color: " + color);
		System.out.println("Age: " + age + " yrs");
	}
	
	
}
