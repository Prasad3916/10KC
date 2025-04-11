package _21_hierarichalinheritance.task3;

public class Triangle extends Shape{
	
	int base;
	int height;
	Triangle(int base,int height){
		this.base=base;
		this.height=height;
	}
	
	void calculateTraingleArea() {
		System.out.println("Area Of The Triangle Is : "+(0.5*base*height));
		System.out.println("-------------------------------------");

	}


}
