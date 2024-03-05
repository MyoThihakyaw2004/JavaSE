package java_basics;

import java.util.Scanner;

public class LabeledBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Lucky draw program
				int[][] table = {{22, 45, 89}, {14, 11, 99}, {78, 54, 41, 33}};
				
				Scanner userInput = new Scanner(System.in);
				while (true) {
					
					System.out.println("Enter your number : ");
					int myNumber = userInput.nextInt();
					
					boolean found = false;
					int rowIndex = -1;
					int columnIndex = -1;
					
					int count = 0;
					
					search:
					for (int i = 0; i < table.length; i++) {
						for(int j = 0; j < table[i].length; j++) {
							count++;
							if (myNumber == table[i][j]) {
								found = true;
								rowIndex = i;
								columnIndex = j;
								break search;
							}
						}
					}
					
					String result = found ? myNumber+" is found at index("+rowIndex+","+columnIndex :
						myNumber+ " is not found";
					System.out.println(result);
					System.out.println("loop " + count + " times");
					
					System.out.println("continue? yes-y or no-n");
					char decision = userInput.next().charAt(0);
					if (decision == 'n') {
						userInput.close();
						break; 
					}
					
				}
				
				System.out.println("Program is terminated");
	}

}
