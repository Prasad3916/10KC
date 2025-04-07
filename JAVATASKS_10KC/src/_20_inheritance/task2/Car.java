package _20_inheritance.task2;

public class Car extends Vehicle {

	void speed() {
		System.out.println("Car. Is Running At 80km/hr");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.run();
		c.speed();
		
	}
}
