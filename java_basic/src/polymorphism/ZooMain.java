package polymorphism;

public class ZooMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		Cat cat3 = new Cat();
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		Gorilla gorilla1 = new Gorilla();
		Gorilla gorilla2 = new Gorilla();
		
		Horse horse1 = new Horse();
		Horse horse2 = new Horse();
		
		Zoo zoo = new Zoo();
		zoo.addAnimal(cat1, 0);
		zoo.addAnimal(cat2, 1);
		zoo.addAnimal(cat3, 2);
		zoo.addAnimal(dog1, 3);
		zoo.addAnimal(dog2, 4);
		zoo.addAnimal(dog3, 5);
		zoo.addAnimal(gorilla1, 6);
		zoo.addAnimal(gorilla2, 7);
		zoo.addAnimal(horse1, 8);
		zoo.addAnimal(horse2, 9);
		
		zoo.showAnimal();
		
//		Zoo zoo = new Zoo();
//		zoo.addCat(cat1, 0);
//		zoo.addCat(cat2, 1);
//		zoo.addCat(cat3, 2);
//		
//		zoo.addDog(dog1, 0);
//		zoo.addDog(dog2, 1);
//		zoo.addDog(dog3, 2);
//		
//		zoo.showCat();
//		zoo.showDog();
	}

}
