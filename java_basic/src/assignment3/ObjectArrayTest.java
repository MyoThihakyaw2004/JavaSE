package assignment3;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Object array
		TestObject obj1 = new TestObject(1, 2, 4);
		TestObject obj2 = new TestObject(2, 5, 1);
		TestObject obj3 = new TestObject(1, 2, 5);
		TestObject objArray[] = {obj1, obj2, obj3};
		
		// String array
		String names[] = {"Mg Mg", "Kyaw Kyaw", "Mya Mya"};
		for (String name : names) {
			System.out.println(name);
		}
		
		// Double array
		Double doubles[] = new Double[3];
		doubles[0] = 10000d;
		doubles[1] = 20000d;
		doubles[2] = 30000d;
		for (Double dou : doubles) {
			System.out.println(dou);
		}
		
		// Float array
		Float floats[] = {12.9f, 321.4f, 15.54f};
		for (float flo : floats) {
			System.out.println(flo);
		}
		
		// Char array
		char charactors[] = {'a', 'b', 'c'};
		for (char charactor : charactors) {
			System.out.println(charactor);
		}
		
		// Boolean array
		boolean bools[] = new boolean[4];
		for (int i = 0; i < bools.length; i++) {
			bools[i] = (i % 2 == 0);
		}
		for (boolean bool : bools) {
			System.out.println(bool);
		}
	}

}
