package function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

class Parent {
	double square(double x) {
		return x * x;
	}
}

public class DoubleColonTest extends Parent {
	
	public DoubleColonTest(String str) {
		System.out.println("Invoked with "+str);
	}
	
	double add(double op1, double op2) {
		return op1 + op2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strArray = Arrays.asList(
				"Sample", "annual", "Month", "year"
				);
		
		strArray.forEach(DoubleColonTest :: new);
		
		//UnaryOperator<Double> sqRootFunc = n -> Math.sqrt(n);
//		UnaryOperator<Double> sqRootFunc = Math :: sqrt;
//		System.out.println("Sqrt of 25.0 = "+sqRootFunc.apply(25.0));
//	
//		DoubleColonTest dbTest = new DoubleColonTest();
//		
//		//BinaryOperator<Double> addFunc = (n1,n2) -> dbTest.add(n1,n2);
//		BinaryOperator<Double> addFunc = dbTest :: add;
//		System.out.println("30.22 + 25.66 = "+addFunc.apply(30.22, 25.66));
//		dbTest.test(10.0);
	} 
	
	void test(Double x) {
		UnaryOperator<Double> sqFunc = super :: square;
		System.out.println(sqFunc.apply(x));
	}

}
