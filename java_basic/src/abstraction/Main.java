package abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Bird();
		animal.makeSound();
		animal.eat();
		animal.walk();
		System.out.println("species : "+ animal.getSpecies());
		
		animal = new Rabbit();
		animal.makeSound();
		animal.eat();
		animal.walk();
		System.out.println("species : "+ animal.getSpecies());
		
		animal = new Snake();
		animal.makeSound();
		animal.eat();
		animal.walk();
		System.out.println("species : "+ animal.getSpecies());
	}

}
