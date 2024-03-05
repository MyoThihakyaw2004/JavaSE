package assignment;

import java.util.Scanner;

public class Callculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput=new Scanner(System.in);

		while (true) {
			
		
System.out.println("Enter your first operand:");
int operand=userInput.nextInt();
System.out.println("Enter your operator");
char operator=userInput.next().charAt(0);
System.out.println("Enter your second operator");
int operand2=userInput.nextInt();
userInput.close();
 int result= switch (operator) {
case '+' ->operand+operand2;
case'-'->operand-operand2;
case'*' -> operand*operand2;
case'/'->operand/operand2;
case'%'-> operand%operand2;




default ->0;

};
System.out.println("The result  of the num is :"+result);
System.out.println("continue? yes-y or no-n");
char decision=userInput.next().charAt(0);
if(decision=='n') {
	userInput.close();
	break;

}}
	}
				
	}
	
