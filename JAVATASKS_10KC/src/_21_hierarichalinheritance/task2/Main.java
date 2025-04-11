package _21_hierarichalinheritance.task2;

public class Main {
	
	public static void main(String[] args) {
		Employee manager=new Manager("Alice",50000,10000,5);
		manager.calculateAnnualSalary();
		((Manager) manager).calculateManagerSalary();
		Employee engineer=new Engineer("Bob",70000,5);
		engineer.calculateAnnualSalary();
		((Engineer) engineer).calculareEngineerSalary();
		Employee salesperson=new SalesPerson("Charlie",40000,(float)0.1,200000);
		salesperson.calculateAnnualSalary();
		((SalesPerson)salesperson).calculateSalesPersonSalary();
	}

}
