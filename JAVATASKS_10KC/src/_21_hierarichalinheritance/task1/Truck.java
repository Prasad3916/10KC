package _21_hierarichalinheritance.task1;

public class Truck extends Vehicle{
	int cargocapacity;
	public Truck(String make,String model,int year,int cargocapacity){
		super(make,model,year);
		this.cargocapacity=cargocapacity;
	}
	void displayTruckInfo() {
		System.out.println(make+" "+model+" "+year);
		System.out.println("Cargo Capacity In Tones "+cargocapacity);
		System.out.println("---------------------------------------------------------");

	}

}
