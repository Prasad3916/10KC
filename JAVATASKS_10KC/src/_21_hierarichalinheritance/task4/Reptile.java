package _21_hierarichalinheritance.task4;

public class Reptile extends Animal{
	boolean iscoldblooded;
	Reptile(String name,String habitat,boolean b){
		super(name,habitat);
		this.iscoldblooded=b;
	}
	void displayReptileInfo() {
		System.out.println("Repatile Is Cold Blooded "+iscoldblooded);
	}

}
