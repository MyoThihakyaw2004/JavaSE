package generics;

public class WildCardTest {
	
	static void identifyBox(Box<?> box) {
		System.out.println(box.get().getClass());
	}
	
	static void identifyNumberBox(Box<? extends Number> box) {
		System.out.println(box.get().getClass());
	}
	
	static void identifyDoubleBox(Box<? super Double> box) {
		System.out.println(box.get().getClass());
	}
		
	//static void identifyBox(Box<Integer> box) {
	//	System.out.println(box.get().getClass());
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.add(2000);
		identifyBox(integerBox);
		identifyNumberBox(integerBox);
		
		Box<Double> doubleBox = new Box<Double>();
		doubleBox.add(23.44);
		identifyBox(doubleBox);
		
		Box<String> stringBox = new Box<String>();
		stringBox.add("Apple");
		identifyBox(stringBox);
		
		Box<SmartPhone> phoneBox = new Box<SmartPhone>();
		phoneBox.add(new SmartPhone());
		identifyBox(phoneBox);
		//identifyNumberBox(phoneBox);
	}

}
