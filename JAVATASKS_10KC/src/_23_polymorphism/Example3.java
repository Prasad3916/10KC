package _23_polymorphism;

class Person{
	protected void display() {
		System.out.println("I Am A Person");
	}
}
class Student extends Person{
	@Override
	public void display() {
		System.out.println("I Am A Student");
	}
}

public class Example3 {
	
	public static void main(String[] args) {
		Person p= new Student();
		p.display();
	}

}
