package abstraction;

public class Snake extends Animal {

	public Snake() {
		super("reptile");
		System.out.println("Inside Snake constructor");
	}
	
	@Override
	protected void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Shee.. Shee..");
	}

	@Override
	protected void eat() {
		// TODO Auto-generated method stub
		System.out.println("Meat");
	}

	@Override
	protected void walk() {
		// TODO Auto-generated method stub
		System.out.println("zip zap");
	}

}
