package _21_hierarichalinheritance.task2;
public class Manager extends Employee {
	int bonus;
	int numberofemployeesmanaged;
	Manager(String name,int basesalary,int bonus,int numberofemployeesmanaged){
		super(name,basesalary);		
		this.bonus=bonus;
		this.numberofemployeesmanaged=numberofemployeesmanaged;
	}
	void calculateManagerSalary() {
		System.out.println("Manager Salary : "+(basesalary+bonus));		
		System.out.println("-------------------------------------");

	}
}
