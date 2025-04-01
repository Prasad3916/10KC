package _17_packages.com.vehicles.app;
import _17_packages.com.vehicles.Car;
import _17_packages.com.vehicles.parts.Engine;
public class CarApp {
	public static void main(String[] args) {
			Car c=new Car();
			Engine e=new Engine();
			c.setBrand("Tesla");
			c.setModel("50Hp");
			c.setPrice(3000000);
			e.setEnginetype("Gear");
			e.setHorsepower(5);
			c.showCarDetails();
			e.showEngineDetails();
	}
}




