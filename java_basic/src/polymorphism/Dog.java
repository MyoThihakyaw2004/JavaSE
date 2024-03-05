package polymorphism;

public class Dog extends Animal {

	@Override
	protected void makeSound() {
		System.out.println("Woof Woof");
	}
	
	@Override
	protected void eat() {
		System.out.println("Beef");
	}
	
	@Override
	protected void walk() {
		System.out.println("Lazy walk");
	}
	
	public void bite() {
		System.out.println("Dog can bite");
	}
	
	public void loyal() {
		System.out.println("Dog are loyal");
	}
}
