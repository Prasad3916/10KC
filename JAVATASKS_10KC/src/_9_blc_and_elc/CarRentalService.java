package _9_blc_and_elc;
public class CarRentalService {

	
	
	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car();
		c1.setCarId(101);
		c1.setBrand("BMW");
		c1.setModel("15 Z");
		c1.setrentalPricePerDay(1000);
		c2.setCarId(102);
		c2.setBrand("Tesla");
		c2.setModel("Model S");
		c2.setrentalPricePerDay(1000);
		System.out.println("--------------Car 1 Details--------------------");
		System.out.println(c1.getCarId());
		System.out.println(c1.getbrand());
		System.out.println(c1.getmodel());
		System.out.println(c1.getrentalPricePerDay());
		System.out.println("--------------Car 1 Details--------------------");
		System.out.println(c2.getCarId());
		System.out.println(c2.getbrand());
		System.out.println(c2.getmodel());
		System.out.println(c2.getrentalPricePerDay());
		
	}
}
