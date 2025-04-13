package _23_polymorphism;
class Shape{
	void draw() {
		System.out.println("Drawing Shape");
	}
}
class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}
}
class Square extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing Square");
	}
}
public class Example5 {
	public static void main(String[] args) {
		Shape c=new Circle();
		Shape s=new Square();
		Shape s1[]= {c,s};
		for(int i=0;i<s1.length;i++) {
			s1[i].draw();
		}
}
}
