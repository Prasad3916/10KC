package _21_hierarichalinheritance.task4;

public class Mammal extends Animal{
	boolean iswarmblooded;
	Mammal(String name,String habitat,boolean b){
		super(name,habitat);
		this.iswarmblooded=b;
	}
	void displaymammalnfo() {
		System.out.println("Mammal Is Warm Blooded "+iswarmblooded);
		
	}

}
