package assignment;

import java.util.Scanner;

public class Swapwithout {
public static void main(String[] args) {
	Scanner userInput=new Scanner(System.in);
	System.out.println("Enter the first number ");
	int a=userInput.nextInt();
	System.out.println("Enter the second number");
	int b=userInput.nextInt();
	System.out.println("Before swapping");
	System.out.println("a ="+a);
	System.out.println("b= "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swapping");
	System.out.println("a="+a);
	System.out.println("b="+b);
	userInput.close();
	 
}
}
