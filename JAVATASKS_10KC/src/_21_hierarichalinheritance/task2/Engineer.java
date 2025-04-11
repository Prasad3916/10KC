package _21_hierarichalinheritance.task2;

public class Engineer extends Employee{
	int projectcount;
	Engineer(String name,int basesalary,int projectcount){
		super(name,basesalary);
		this.projectcount=projectcount;
	}
	void calculareEngineerSalary() {
		System.out.println("Engineer Salary : "+((basesalary+(1000*projectcount))));
		System.out.println("-------------------------------------");
	}

}
