package java_basics;

import java.util.Iterator;

public class ValueTypeVsReferenceTYpe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		addOne(x);
		System.out.println("currentValue of x = " + x);
		int[] array = {10, 20, 30, 40, 50};
		System.out.println("before add one : ");
		printArray(array);
		addArrayOne(array);
		System.out.println("After add one : ");
		printArray(array);
	}

	// Value type test
	static void addOne(int x) {
		x++;
	}
	
	static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	// Reference Type Test
	static void addArrayOne(int[] array) {
		
//		for (int element : array) {
//			element = element + 1;
//		}
		
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
}
