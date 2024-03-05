package java_basics;

public class Book {
	
	
	String name;
	String color;
	String owner;
	int currentPage; // Shows current page
	String pages[];
	
	Book(int newPageCount) {
		currentPage = 0;
		this.pages = new String[newPageCount];
	}
	
	Book(String newName, String newColor, int newPageCount, String newOwner) {
		name = newName;
		color = newColor;
		owner = newOwner;
		
		currentPage = 0;
		this.pages = new String[newPageCount];
	}
	
	void addNote(String... notes) {
		int length = pages.length;
		for (String note : notes) {
			if (currentPage >= length) {
				System.out.println("The book is full");
				break;
			}
			
			pages[currentPage] = note;
			currentPage++;
		}
	}
	
	String getPage(int pageNo) {
		return pages[pageNo];
	}
	
	int availablePages() {
		return pages.length - currentPage;
	}
	
	void information() {
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("PageCount: "+ pages.length);
		System.out.println("owner: " + owner);
	}
	
}
