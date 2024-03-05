package polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cat cat = new Cat();
//		cat.makeSound();
//		
//		Dog dog = new Dog();
//		dog.eat();
		
		Animal animal = new Cat();
		animal.makeSound();
		animal.eat();
		animal.walk();
//		Cat cat = (Cat)animal;
//		cat.jump();
//		cat.scratch();
		
		if (animal instanceof Dog) {
			Dog dog = (Dog)animal;
			dog.bite();
			dog.loyal();
		} else {
			System.out.println("appointed obj is not instance of Dog");
		}
		
		animal = new Dog();
		animal.makeSound();
		animal.eat();
		animal.walk();
		
		if (animal instanceof Dog) {
			Dog dog = (Dog)animal;
			dog.bite();
			dog.loyal();
		} else {
			System.out.println("appointed obj is not instance of Dog");
		}
		
		animal = new Gorilla();
		animal.makeSound();
		animal.eat();
		animal.walk();
	}

}
