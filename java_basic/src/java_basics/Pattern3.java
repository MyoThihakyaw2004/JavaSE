package java_basics;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				/*
				 * For every row, the number of spaces is decremented by one
				 * Subtracting current row number from row count (in this case, subtracting i from 5)
				 * gives us the number of spaces we need to print for the current row
				 * 
				 * If j exceeds the number of spaces for current row, print *
				 */
				if (j <= (5 - i)) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
	}

}
