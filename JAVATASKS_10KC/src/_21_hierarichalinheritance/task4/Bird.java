package _21_hierarichalinheritance.task4;

public class Bird extends Animal{
	boolean canfly;
	Bird(String name,String habitat,boolean b){
		super(name,habitat);
		this.canfly=b;
	}
	void displayBirdInfo() {
		System.out.println("Bird Can Fly "+canfly);
	}

}
