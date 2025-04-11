package _21_hierarichalinheritance.task3;

public class Rectangle extends Shape{
	int length;
	int breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void calculateRectangleArea() {
		System.out.println("Area Of The Rectangle Is : "+(length*breadth));
		System.out.println("-------------------------------------");

	}


}
