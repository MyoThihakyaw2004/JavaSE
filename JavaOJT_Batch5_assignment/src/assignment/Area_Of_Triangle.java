package assignment;

import java.util.Scanner;

public class Area_Of_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner userInput=new Scanner(System.in);
System.out.println("Enter the length of the base of the triangle");
double base=userInput.nextDouble();
System.out.println("Enter the length of the height of the triangle");
double height=userInput.nextDouble();
double area=(0.5)*base*height;
System.out.println("The area of the triangle is  :"+area);
	}

}
