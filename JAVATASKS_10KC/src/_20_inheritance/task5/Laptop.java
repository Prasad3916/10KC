package _20_inheritance.task5;

public class Laptop extends Computer{
	void showmodel() {
		System.out.println("Model: XPS 15");
	}
	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.showbrand();
		l.showmodel();
	}
	
}
