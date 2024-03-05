package generics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberBox<Integer> numberBox1 = new NumberBox<Integer>();
		numberBox1.add(3400);
		System.out.println("numberBox1 : " + numberBox1.get());
		
		NumberBox<Double> numberBox2 = new NumberBox<Double>();
		numberBox2.add(23.33);
		System.out.println("numberBox2 : " + numberBox2.get());

		//NumberBox<String> numberBox3 = new NumberBox<String>();
		
		
//		Box<Integer> IntegerBox = new Box<>();
//		IntegerBox.add(1000);
//		Integer intObj = IntegerBox.get();
//		
//		Box<Double> doubleBox = new Box<Double>();
//		doubleBox.add(12.22);
		
		
//		Box box = new Box();
//		box.add(1000);
//		System.out.println("box : " + box.get());
//		
//		Box stringBox = new Box();
//		stringBox.add("MgMg");
//		System.out.println("stringBox : "+stringBox.get());
//		
//		Box doubleBox = new Box();
//		doubleBox.add(23.44);
//		System.out.println("doubleBox : "+doubleBox.get());
//		
//		SmartPhone phone = new SmartPhone("Xiaomi", "Mi13 pro", 599.99);
//		Box phoneBox = new Box();
//		phoneBox.add(phone);
//		System.out.println("PhoneBox: "+ phoneBox.get());
	}

}
