package polymorphism;

public class Horse extends Animal {
	
	@Override
	protected void makeSound() {
		System.out.println("HeHe");
	}
	
	@Override
	protected void eat() {
		System.out.println("Eat grass");
	}
	
	@Override
	protected void walk() {
		System.out.println("Walk like dance");
	}
}
