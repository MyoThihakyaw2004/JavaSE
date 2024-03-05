package polymorphism;

public class Zoo {
	
	private Animal[] animals = new Animal[30];
	
public void addAnimal(Animal animal, int index) {
		
		System.out.println("added : " + animal);
		animals[index] = animal;
	}
	
	public void showAnimal() {
		int i = 1;
		for (final Animal animal: animals) {
			if (animal == null) continue;
			System.out.println("Animal #"+i);
			animal.makeSound();
			animal.eat();
			animal.walk();
			System.out.println();
			i++;
		}
	}
	
	// Fixed code
	//private Animal animals[];
//	private Cat[] cats = new Cat[10];
//	private Dog[] dogs = new Dog[10];
//	
//	public void addCat(Cat cat, int index) {
//		
//		System.out.println("added : " + cat);
//		cats[index] = cat;
//	}
//	
//	public void showCat() {
//		int i = 1;
//		for (final Cat cat: cats) {
//			if (cat == null) continue;
//			System.out.println("Cat #"+i);
//			cat.makeSound();
//			cat.eat();
//			cat.walk();
//			System.out.println();
//			i++;
//		}
//	}
//	
//public void addDog(Dog dog, int index) {
//		
//		System.out.println("added : " + dog);
//		dogs[index] = dog;
//	}
//	
//	public void showDog() {
//		int i = 1;
//		for (final Dog dog: dogs) {
//			if (dog == null) continue;
//			System.out.println("Dog #"+i);
//			dog.makeSound();
//			dog.eat();
//			dog.walk();
//			System.out.println();
//			i++;
//		}
//	}
}
