package _17_packages.com.vehicles.parts;
public class Engine {
	private String enginetype;
	private int horsepower;
	public String getEnginetype() {
		return enginetype;
	}
	public void setEnginetype(String enginetype1) {
		enginetype = enginetype1;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower1) {
		horsepower = horsepower1;
	}
	public void showEngineDetails() {
		System.out.println("Engine Type "+getEnginetype());
		System.out.println("Horse Power "+getHorsepower());
	}
	
}
