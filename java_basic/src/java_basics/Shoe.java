package java_basics;

public class Shoe {
	String brand;
	String model;
	String color;
	int size;
	int releasedYear;
	String condition = "new"; // Consider a new object as a new shoes
	
	Shoe(String newBrand, String newModel, String newColor, int newSize, int newReleasedYear) {
		brand = newBrand;
		model = newModel;
		color = newColor;
		size = newSize;
		releasedYear = newReleasedYear;
	}
	
	void wear() {
		System.out.println("The shoes are now worn");
		System.out.println("You made the shoes dirty");
		condition = "dirty";
	}
	
	void clean() {
		System.out.println("The shoes are being cleaned");
		condition = "clean";
	}
	
	void checkCondition() {
		System.out.println("The shoes are " + condition);
	}
	
	void information() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Color: "+ color);
		System.out.println("Size: " + size);
		System.out.println("Year:" + releasedYear);
	}
}
