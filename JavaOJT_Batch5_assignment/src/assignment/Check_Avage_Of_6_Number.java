package assignment;

import java.util.Scanner;

public class Check_Avage_Of_6_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner userInput=new Scanner(System.in);
double sum=0;

for(int i=1;i<=6;i++) {
	System.out.println("Enter number"+i+":");
	double num=userInput.nextDouble();
	sum+=num;
}
double average=sum/6;
System.out.println("The average of th 6 numbers is"+average);
userInput.close();

	}

}
