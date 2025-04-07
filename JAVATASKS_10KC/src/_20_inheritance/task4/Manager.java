package _20_inheritance.task4;

public class Manager extends Employee{
	int bonus=20000;
	public static void main(String[] args) {
		Manager m=new Manager();
		System.out.println(m.salary+m.bonus);
	}
}
