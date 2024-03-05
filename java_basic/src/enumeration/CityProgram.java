package enumeration;

import java.util.Scanner;

public class CityProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("1.All 2.Specific 3.Ordinal");
		
		int operation = userInput.nextInt();
		
		switch (operation) {
		case 1 -> {
			City[] cities = City.values();
			
			for (City city : cities) {
				System.out.printf("%d - %s : (%d, %d)%n", city.ordinal(), city.name(), city.getRank(), city.getPopulation());
			}
		}
		case 2 -> {
			System.out.println("Enter City Name : ");
			String cityName = userInput.next().toUpperCase();
			City city = City.valueOf(cityName);
			
			System.out.printf("%d - %s : (%d, %d)%n", city.ordinal(), city.name(), city.getRank(), city.getPopulation());

		}
		
		default -> System.out.println("Invalid Data");
		}
		
		userInput.close();
	}

}
