package assignment;

import java.util.Scanner;

public class EvenOddCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner userInput=new Scanner(System.in);
System.out.println("Enter the integer");
int num=userInput.nextInt();
if(num %2==0) {
	System.out.println("Even :"+num);
	
}else {
	System.out.println("Odd :"+num);
}
userInput.close();
	}


}
