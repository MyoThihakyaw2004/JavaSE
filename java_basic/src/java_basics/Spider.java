package java_basics;

public class Spider {
	
	int legs = 8;// Most spiders have 8 legs and 8 eyes
	int eyes = 8;
	
	String name;
	String location;
	int age; // months
	int size; // cm
	
	Spider(String newName, String newLocation, int newAge, int newSize){
		name = newName;
		location = newLocation;
		age = newAge;
		size = newSize;
	}
	
	void hunt() {
		System.out.println(name + " caught a random insect");
	}
	
	/**
	 * Try throwing something at the spider.
	 * I'm sure it can catch it
	 * @param item
	 */
	void hunt(String item) {
		System.out.println(name + " caught a " + item);
	}
	
	void molt() {
		System.out.println(name+ " shed its exterior exoskeleton");
	}
	
	
	void web() {
		System.out.println(name+ " is making a web");
	}
	
	void information() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age + " months");
		System.out.println("Location: "+ location);
		System.out.println("size: " + size + " cm");
	}
	
}
