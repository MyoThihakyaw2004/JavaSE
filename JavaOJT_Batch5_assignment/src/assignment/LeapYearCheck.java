package assignment;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner userInput=new Scanner(System.in);
System.out.println("Enter a year :");
int year=userInput.nextInt();
boolean LeapYear=false;
if((year %4==0&&year %100 !=0)||(year%400==0)) {
	LeapYear=true;
	
}
if(LeapYear) {
	System.out.println(year+"is a leap year");
}
else {
	System.out.println(year+"is not a leap year");
}
userInput.close();
	}

}
