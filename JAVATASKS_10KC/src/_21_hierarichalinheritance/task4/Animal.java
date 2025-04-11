package _21_hierarichalinheritance.task4;

public class Animal {
	String name;
	String habitat;
	Animal(String name,String habitat){
		this.name=name;
		this.habitat=habitat;
	}
	void displayHabitat() {
		System.out.println("Habitat "+habitat);
	}
}
