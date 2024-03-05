package abstraction;

public abstract class Animal {
	
	public static final String TYPE = "LIVING THING";

	private String species;
	
	public static void description() {
		System.out.println("Parent class of all animals");
	}
	
	public Animal(String species) {
		super();
		this.species = species;
	}

	public Animal() {
		System.out.println("Inside Animal constructor");
	};
	
	protected abstract void makeSound();
	
	protected abstract void eat();
	
	protected abstract void walk();

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	
}
