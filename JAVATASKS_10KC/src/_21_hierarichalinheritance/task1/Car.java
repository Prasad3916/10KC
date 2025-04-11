package _21_hierarichalinheritance.task1;

public class Car extends Vehicle {
	int numberofdoors;
	public Car(String make,String model,int year,int numberofdoors){
		super(make,model,year);
		this.numberofdoors=numberofdoors;
	}
	void displayCarInfo() {
		System.out.println(make+" "+model+" "+year);
		System.out.println("Number Of Doors "+numberofdoors);
		System.out.println("---------------------------------------------------------");
	}
}
