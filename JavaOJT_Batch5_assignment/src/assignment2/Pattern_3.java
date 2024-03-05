package assignment2;

import java.util.Iterator;
import java.util.Scanner;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner userInput=new Scanner(System.in);
System.out.println("Enter your number :");
int num1=userInput.nextInt();
System.out.println("Enter your number2");
int num2=userInput.nextInt();
userInput.close();
for(int j = 2; j <= num1; j++) {
for (int i = 2; i <= num2; i++) {
	System.out.printf("%s ", "* "/*i*/);
}
System.out.println();
}




}
}
