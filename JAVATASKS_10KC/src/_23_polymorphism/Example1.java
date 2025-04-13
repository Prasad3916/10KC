package _23_polymorphism;

class Animal {
	
	void makesound() {
		System.out.println("Animal Sound");
	}

}

class Dog extends Animal{
	void makesound() {
		System.out.println("Bark");
	}
}


class Example1{
	public static void main(String[] args) {
		Animal a=new Animal();
		Dog d= new Dog();
		Animal a1=new Dog();
		a.makesound();
		d.makesound();
		a1.makesound();
	}
}
