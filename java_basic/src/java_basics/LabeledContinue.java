package java_basics;

import java.util.Scanner;

public class LabeledContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String sentence = userInput.nextLine();
		System.out.println("Enter a search String : ");
		String searchedString = userInput.nextLine();
		userInput.close();
		
		int max = sentence.length() - searchedString.length();
		boolean found = false;
		
		test:
		for (int i = 0; i < max; i++) {
			int n = searchedString.length();
			int j = i;
			int k = 0;
			
			while (n-- != 0) {
				if (sentence.charAt(j++) != searchedString.charAt(k++)) {
					continue test;
				}
				found = true;
				break test;
			}
		}
		System.out.println(found? searchedString+" is found" : searchedString+ " is not found");
		
	}

}
