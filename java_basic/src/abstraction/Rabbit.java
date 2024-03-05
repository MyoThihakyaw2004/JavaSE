package abstraction;

public class Rabbit extends Animal {

	public Rabbit() {
		super("Mammals");
		System.out.println("Inside Rabbit constructor");
	}
	
	@Override
	protected void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Shuu Shuu");
	}

	@Override
	protected void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat grass");
	}

	@Override
	protected void walk() {
		// TODO Auto-generated method stub
		System.out.println("Jump");
	}

}
