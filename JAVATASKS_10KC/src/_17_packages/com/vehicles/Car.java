package _17_packages.com.vehicles;
public class Car {
	private String model;
	private String brand;
	private double price;
	public String getModel() {
		return model;
	}
	public void setModel(String model1) {
		model = model1;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand1) {
		brand = brand1;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price1) {
		price = price1;
	}
	public void showCarDetails() {
		System.out.println("Car Brand "+getBrand());
		System.out.println("Car Model "+getModel());
		System.out.println("Car Price "+getPrice());
	}
}
