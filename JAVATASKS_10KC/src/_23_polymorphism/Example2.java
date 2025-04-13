package _23_polymorphism;
class Vehicle{
	void displayStart() {
		System.out.println("Vehicle Started");
	}
}
class Car extends Vehicle{
	@Override
	void displayStart() {
		System.out.println("Car Started");
	}
}
public class Example2 {
	public static void main(String[] args) {
		Vehicle v=new Car();
		Vehicle v1=new Vehicle();
		Car c1=new Car();
		v.displayStart();
		c1.displayStart();
		v1.displayStart();
	}
}
