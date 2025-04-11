package _21_hierarichalinheritance.task2;

public class Employee {
	String name;
	int basesalary;
	Employee(String name,int basesalary){
		this.name=name;
		this.basesalary=basesalary;
		
	}
	void calculateAnnualSalary() {
		System.out.println("Name : "+name);
		
		System.out.println("Annual Salary "+(basesalary*12));
		
	}

}
