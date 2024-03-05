package assignment;

import java.util.Scanner;

public class Area_Of_Trapezium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner userInput= new Scanner(System.in);
System.out.println("Enter the baseA of the Trapezium");
double baseA=userInput.nextDouble();
System.out.println("Enter the baseB of the Trapezium");
double baseB=userInput.nextDouble();
System.out.println("Enter the height of the Trapezium");
double height=userInput.nextDouble();
double area=0.5*(baseA+baseB)*height;
System.out.println("The area of the Trapezium is :"+area);
userInput.close();

	}

}
