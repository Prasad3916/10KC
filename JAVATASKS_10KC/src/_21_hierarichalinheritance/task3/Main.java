package _21_hierarichalinheritance.task3;

public class Main {
	public static void main(String[] args) {
		Shape s;
		s=new Circle(5);
		s.calculatearea();
		((Circle)s).calculateCicleArea();
		s=new Rectangle(10,20);
		s.calculatearea();
		((Rectangle)s).calculateRectangleArea();
		s=new Triangle(10,20);
		s.calculatearea();
		((Triangle)s).calculateTraingleArea();
		
	}

}
