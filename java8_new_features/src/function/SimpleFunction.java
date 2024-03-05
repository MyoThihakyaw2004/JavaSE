package function;

import java.util.function.Function;

public class SimpleFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> indexBFunc = s -> s.indexOf("b");
		Integer BIndex = indexBFunc.apply("Asemble");
		System.out.println("bIndex : " + BIndex);
		
		Function<Integer, Double> oneFourth = n -> n/4.0;
		System.out.println("1/4 of 100 = "+oneFourth.apply(50));
	}

}
