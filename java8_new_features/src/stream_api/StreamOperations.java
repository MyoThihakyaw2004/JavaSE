package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList = Arrays.asList(
			new Product("L-001", "MSI Cyborg G17", 4000.99),
			new Product("E-001", "Panasonic I100 Fan", 99.99),
			new Product("E-002", "Midea Refrigerator", 400.99),
			new Product("F-001", "Burger", 20.99),
			new Product("H-001", "Sofa", 600.23),
			new Product("E-003", "Xiaomi Smart TV", 800.45),
			new Product("L-002", "Asus ROG Strip", 3500.99),
			new Product("P-001", "Nubia Redmagic 9s pro", 1024.55),
			new Product("P-002", "Xiaomi Mi 14 pro", 899.99),
			new Product("P-003", "Asus ROG 7 Ultimate", 1300.99),
			new Product("P-003", "Asus ROG 7 Ultimate", 1300.99)
				);
		
			productList.stream().skip(6).forEach(System.out :: println);
			productList.stream().limit(3).forEach(System.out :: println);
		
//			List<String> countryList = Arrays.asList(
//				"Myanmar", "Japan", "Korea", "Indonesia", "USA"
//					);
//			countryList.stream().sorted().forEach(System.out :: println);
			
//			List<Product> sortedList = productList.stream()
//					.sorted((p1, p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1)
//					.toList();
//			sortedList.forEach(System.out :: println);
		
//			Product maxProdoct = productList.stream()
//					.max((p1, p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1)
//					.get();
//			System.out.println(maxProdoct);
//			
//			Product minProduct = productList.stream()
//					.min((p1, p2) -> p1.getPrice() < p2.getPrice() ? -1 : 1)
//					.get();
//			System.out.println(minProduct);
		
//			Double averagePrice = productList.stream()
//					.collect(Collectors.averagingDouble(p -> p.getPrice()));
//			System.out.println("Average Price : "+averagePrice);
		
//			Double totalPrice = productList.stream()
//					.map(p -> p.getPrice())
//					.reduce(0.0, (price, sum) -> price+sum);
//			System.out.println("Total price : "+totalPrice);
		
//			Double totalPrice = productList.stream()
//					.collect(Collectors.summingDouble(p -> p.getPrice()));
//			System.out.println("Total Price : "+totalPrice);
		
//			Map<String, String> productMap = productList.stream()
//					.collect(Collectors.toMap(p -> p.getCode(), p -> p.getName());
//							
//			System.out.println(productMap);
		
//			List<Double> priceListGT1000 = productList.stream()
//					.filter(p -> p.getPrice() > 1000.0)
//					.map(p -> p.getPrice())
//					.toList();
//			System.out.println(priceListGT1000);
			
			
			
//			List<Product> filteredList = productList.stream()
//					.filter(p -> p.getPrice() < 1000.0)
//					.toList();
//			
//			System.out.println("Product List below 1000");
//			filteredList.forEach(System.out :: println);
		
			Set<String> productNameSet = productList.stream()
					.map(p -> p.getName())
					.collect(Collectors.toSet());
			System.out.println(productNameSet);
	}

}
