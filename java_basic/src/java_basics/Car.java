package java_basics;

// 
public class Car {
	static int noOfWheels;
	String brand = "Toyota";
	String model;
	double price;
	int year;
	int speedPerKM;
	
	void engineStart() {
		System.out.printf("%s's Engine is starting%n", model);
	}
	
	void drive() {
		System.out.printf("%s car is driving%n", model);
	}
	
	void brake() {
		System.out.printf("%s car is braked%n", model);
	}
	
	void horn() {
		System.out.printf("%s car is horning%n", model);
	}
	
	void information() {
		System.out.println("Car Information: ");
		System.out.printf("brand = %s%n", brand);
		System.out.printf("model = %s%n", model);
		System.out.printf("price = %.3f%n", price);
		System.out.printf("year = %d km %n", speedPerKM);
		System.out.printf("There are %d wheels in this car%n", noOfWheels);
	}
}
