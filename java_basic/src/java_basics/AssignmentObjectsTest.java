package java_basics;

public class AssignmentObjectsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person(1010L, "Mg Mg", 20, "male", "teacher");
		person.greet();
		person.study();
		person.goToJob();
		person.information();
		System.out.println();
		
		Book myNoteBook = new Book("Note Book", "black", 50, "Mg Mg");
		myNoteBook.addNote("Hello! This is Mg Mg", "I am a teacher"); // Varargs method
		System.out.println("Page 1 : " + myNoteBook.getPage(1));
		System.out.println(myNoteBook.availablePages() + " pages still available");
		myNoteBook.information();
		System.out.println();
		
		Spider spider = new Spider("Jumping Spider", "Myanmar", 3, 1);
		spider.web();
		spider.hunt("fly");
		spider.molt();
		spider.information();
		System.out.println();
		
		Cat cat = new Cat("Pluto", "Mixed", "Orange", "male", 1);
		cat.hunt();
		cat.meow(3);
		cat.play();
		cat.stepOnKeyboard();
		cat.information();
		System.out.println();
		
		Shoe shoes = new Shoe("Nike", "AQ366", "Blue", 10, 2020);
		shoes.checkCondition();
		shoes.wear();
		shoes.clean();
		shoes.checkCondition();
		shoes.information();
		
	}

}
