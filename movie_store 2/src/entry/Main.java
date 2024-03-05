package entry;

import java.util.Scanner;

import controller.MovieController;
import view.MovieView;

public class Main {
	
	private final static MovieView movieView = new MovieView();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("### movie Store ###");
		operate(userInput);
		
	}
	
	private static void operate(Scanner userInput ) {
		while (true) {
			System.out.println("1.list 2.search 3.create 4.update 5.delete");
			int operation = userInput.nextInt();
			
			switch (operation) {
			case 1 -> movieView.showMovieList();
			case 2 -> {
				System.out.println("1.ID 2.title");
				int searchOption = userInput.nextInt();
				switch (searchOption) {
				case 1 -> movieView.showIdSearchResult(userInput);
				case 2 -> movieView.showTitleSearchResult(userInput);
				
				default ->
				throw new IllegalArgumentException("Unexpected value: " + searchOption);
				}
			}
			case 3 -> movieView.showCreateResult(userInput);
			case 4 -> movieView.showUpdateResult(userInput);
			case 5 -> movieView.showDeleteResult(userInput);
			
			default ->
			throw new IllegalArgumentException("Unexpected value: " + operation);
			}
			
			System.out.println("Continue ? Y or N");
			char decision = userInput.next().charAt(0);
			if (decision == 'N') {
				userInput.close();
				break;
			}
		}
	
		//int operation = userInput.nextInt();
	}

}
