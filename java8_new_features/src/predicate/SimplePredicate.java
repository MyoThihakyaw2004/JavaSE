package predicate;

import java.util.function.Function;
import java.util.function.Predicate;

public class SimplePredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> evenOrOdd = n -> n % 2 == 0;
		Integer test = 24;
		System.out.println(evenOrOdd.test(test) ? "even" : "odd");
	
		Predicate<String> startWithDigit = s -> Character.isDigit(s.charAt(0));
		String varName = "6apples";
		
		System.out.println(startWithDigit.test(varName) ? "Invalid: starts with digit" : "Valid");
		Function<Integer, Double> oneFourth = n -> n/4.0;
		System.out.println("1/4 of 50 = "+oneFourth.apply(50));
		
		Function <Double, Double> x5 = n -> n * 5;
		double result = oneFourth.andThen(x5).apply(100);
		System.out.println(result);
		
		Function<Integer, Integer> identityFunc = Function.identity();
	}
	

}
