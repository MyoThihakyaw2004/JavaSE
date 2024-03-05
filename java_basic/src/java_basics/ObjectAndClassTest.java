package java_basics;

//Driver class
public class ObjectAndClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car.noOfWheels = 4;
		System.out.println(Car.noOfWheels);
		
		System.out.println(new Car());// Create car object on heap memory
		System.out.println(new Car());
		
		System.out.println(new Car().brand);
		
		Car ciaz = new Car();
		ciaz.brand = "Nissan";
		ciaz.model = "Ciaz-202";
		ciaz.price = 4000.345;
		ciaz.year = 2022;
		ciaz.speedPerKM = 100;
		ciaz.noOfWheels = 8;
		
		ciaz.engineStart();
		ciaz.drive();
		ciaz.horn();
		ciaz.brake();
		ciaz.information();
		
		Car hilux = new Car();
		hilux.model = "hilux-GT";
		hilux.price = 12000.22;
		hilux.year = 2023;
		hilux.speedPerKM = 200;
		
		hilux.information();
		
//		System.out.println(ciaz.brand);
//		System.out.println(ciaz.model);
//		System.out.println(ciaz.price);
//		System.out.println(ciaz.year);
//		System.out.println(ciaz.speedPerKM);
	}

}
