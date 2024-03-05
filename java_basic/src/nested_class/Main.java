package nested_class;

import nested_class.ArithmeticOperations.Addition;
import nested_class.ArithmeticOperations.Multiply;
import nested_class.ArithmeticOperations.Subtraction;
import nested_class.SecurityCheck.Check;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecurityCheck sc = new SecurityCheck("adfhjlad123!@#");
		SecurityCheck.Check check = sc.new Check();
		System.out.println(check.checkPassword1());
		
//		ArithmeticOperations operations = new ArithmeticOperations(24.5, 12.3);
//		
//		Addition addition = operations.new Addition();
//		System.out.println("34.5+12.3 = "+addition.add(34.5, 12.3));
//		System.out.println("34.5+12.3+4.5 = "+addition.add(34.5, 12.3, 4.5));
//		System.out.println("String contact = "+addition.add("I am", "a legend"));
//		
//		Subtraction subtraction = operations.new Subtraction();
//		System.out.println("sub = "+ subtraction.sub());
//		
//		Multiply multiply = operations.new Multiply();
//		System.out.println("mul = " + multiply.mul());
//		
//		Multiply multiply2 = operations.new Multiply(6);
//		System.out.println("multiply x 6 : "+multiply2.multiplier());
//		System.out.println(multiply2.staticVar);
	}

}
