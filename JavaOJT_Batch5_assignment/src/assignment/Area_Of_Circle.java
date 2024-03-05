package assignment;

import java.util.Scanner;

public class Area_Of_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner userInput=new Scanner(System.in);
System.out.println("Enter the radius of the circle");
double radius=userInput.nextDouble();
double ara=Math.PI*Math.pow(radius, 2);
System.out.println("The ara of the circle is"+ara);
userInput.close();

	}

}
