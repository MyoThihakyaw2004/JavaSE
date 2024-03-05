package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import stream_api.Product;

public class OptionalTest {
	
	static List<Product> productList = Arrays.asList(
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<Product> productOpt = findProduct("Sofa");
		if(productOpt.isPresent()) {
			Product product = productOpt.get();
			System.out.println("Price : "+product.getPrice());
		} else {
			Product product = productOpt.get();
			System.out.println("Price : "+product.getPrice());
		}

		//Product product = findProduct("Black Sofa");
		
//		if(product != null) {
//			System.out.println("Price : "+product.getPrice());
//		} else {
//			System.out.println("Product is null");
//		}
	}
	
	static Optional<Product> findProduct(String name) {
		
		Optional<Product> productOptional = Optional.empty();
		
		for (final Product product : productList) {
			if(product.getName().equals(name)) {
				productOptional = Optional.of(product);
				break;
			}
		}
		return productOptional;
		
//		Product product = null;
//		
//		for(final  Product tempProduct : productList) {
//			if(tempProduct.getName().equals(name)) {
//				product = tempProduct;
//				break;
//			}
//		}
//		
//		return product;
	}

}
