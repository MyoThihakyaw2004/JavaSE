package polymorphism;

public class Cat extends Animal {

	@Override
	protected void makeSound() {
		System.out.println("Meow Meow");
	}
	
	@Override
	protected void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat Food");
	}
	
	@Override
	protected void walk() {
		// TODO Auto-generated method stub
		System.out.println("Cat walk");
	}
	
	public void jump() {
		System.out.println("Cat can jump 1.5 m");
	}
	
	public void scratch() {
		System.out.println("Cat ca scratch");
	}
}
