package _21_hierarichalinheritance.task4;

public class Main {
	
	public static void main(String[] args) {
		Animal a;
		a=new Mammal("Mammal","Savannah",true);
		a.displayHabitat();
		((Mammal)a).displaymammalnfo();
		a=new Reptile("Reptile","Forest",true);
		a.displayHabitat();
		((Reptile)a).displayReptileInfo();
		a=new Bird("Bird","Desert",true);
		a.displayHabitat();
		((Bird)a).displayBirdInfo();
	}

}
