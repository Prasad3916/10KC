package _21_hierarichalinheritance.task2;

public class SalesPerson extends Employee {
	float commisionrate;
	int totalsales;

	SalesPerson(String name,int basesalary,float commisionrate,int totalsales){
		super(name,basesalary);		
		this.commisionrate=commisionrate;
		this.totalsales=totalsales;
	}
	void calculateSalesPersonSalary() {
		System.out.println("Sales Peron Salary : "+(basesalary+(commisionrate*totalsales)));
		System.out.println("-------------------------------------");

	}
}
