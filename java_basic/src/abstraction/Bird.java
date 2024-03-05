package abstraction;

public class Bird extends Animal {

	public Bird() {
		super("Bird");
		System.out.println("Inside Bird constructor");
	}
	
	@Override
	protected void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Kyali Kyali");
	}

	@Override
	protected void eat() {
		// TODO Auto-generated method stub
		System.out.println("grains");
	}

	@Override
	protected void walk() {
		// TODO Auto-generated method stub
		System.out.println("Fly");
	}

}
