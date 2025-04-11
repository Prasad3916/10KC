package _21_hierarichalinheritance.task1;

public class Main {

	public static void main(String[] args) {
		Vehicle car=new Car("Toyota","Corolla",2022,4);
		car.displayInfo();
		((Car) car).displayCarInfo();
		Vehicle truck=new Truck("Ford","F-150",2021,1000);
		truck.displayInfo();
		((Truck) truck).displayTruckInfo();
		Vehicle motorcycle=new MotorCycle("Harley-Davidson","Street Glide",2023,"Yes");
		car.displayInfo();
		((MotorCycle) motorcycle).displayMotorCycleInfo();

		
	}
}
