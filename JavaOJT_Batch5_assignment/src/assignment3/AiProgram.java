package assignment3;

import java.util.Scanner;

public class AiProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner userInput=new Scanner(System.in);
while (true) {
	

	System.out.println("Enter your question : Can you recommend a good movie for family movie night? Why  is the python important in the future?  How do you say I Love in Chinese?");
String question=userInput.nextLine();

if(question.equals("Can you recommend a good movie for family movie night?")) {
	System.out.println("I recommend a good movie for family movie night is horror movie.");
}else if(question.equals("Why is the python important in the future?")) {
	System.out.println("The python is important in the future because it's ease of learning and use,versatility and flexibility,data Science, Machine Learning, and AI and ect...");
} else if (question.equals("How do you say I Love in Chinese?")) {
	System.out.println("我愛你");
}else {
	System.out.println("Invalid Data");
}
System.out.println("continue? yes-y or no-n");
char decision=userInput.next().charAt(0);
if(decision=='n') {
	userInput.close();
	break;
} 
else {
	System.out.println("system is terminate");
}
		}

	}

}

	
	


