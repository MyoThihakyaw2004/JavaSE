package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> fruitStream = Stream.of("Mango", "Banana", "Papaya", "Kiwi");
		fruitStream.forEach(System.out :: println);
	
		Integer[] numbers = {10, 20, 30, 40, 50, 60};
		Stream<Integer> numberStream = Arrays.stream(numbers);
		System.out.println("Fully Stream");
		numberStream.forEach(System.out :: println);
		
		Stream<Integer> numberStreamPartial = Arrays.stream(numbers, 1, 4);
		System.out.println("Partial Stream");
		numberStreamPartial.forEach(System.out :: println);
		
		List<Double> doubleList = Arrays.asList(23.44, 45.66, 23.11, 45.66);
		Stream<Double> doubleStream = doubleList.stream();
		doubleStream.forEach(System.out :: println);
		
	}

}
