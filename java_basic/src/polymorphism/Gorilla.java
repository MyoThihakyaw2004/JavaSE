package polymorphism;

public class Gorilla extends Animal {
	
	@Override
	protected void eat() {
		System.out.println("Banana");
	}
	
	@Override
	protected void walk() {
		System.out.println("walk like humans");
	}
	
	@Override
	protected void makeSound() {
		super.makeSound();
		System.out.println("WuuWuu Warr Warr");
	}
}
