package generics;

public class SmartPhone {

	private String brand;
	private String model;
	private Double price;
	
	public SmartPhone() {
		
	}
	
	

	public SmartPhone(String brand, String model, Double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	

	@Override
	public String toString() {
		return "SmartPhone [brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}



	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
