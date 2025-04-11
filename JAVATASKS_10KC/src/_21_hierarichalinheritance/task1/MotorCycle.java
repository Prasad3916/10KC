package _21_hierarichalinheritance.task1;

public class MotorCycle extends Vehicle{
	String hassidebar;
	public MotorCycle(String make,String model,int year,String hassidebar){
		super(make,model,year);
		this.hassidebar=hassidebar;
	}
	void displayMotorCycleInfo() {
		System.out.println(make+" "+model+" "+year);
		System.out.println("Has Side Bar "+hassidebar);
		System.out.println("---------------------------------------------------------");

	}

}
