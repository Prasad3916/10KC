package _21_hierarichalinheritance.task3;

public class Circle extends Shape{
	int radius;
	Circle(int radius){
		this.radius=radius;
		
	}
	void calculateCicleArea() {
		System.out.println("Area Of The Circle Is : "+(Math.PI*radius*radius));
		System.out.println("-------------------------------------");

	}

}
