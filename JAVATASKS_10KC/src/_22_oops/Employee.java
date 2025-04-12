package _22_oops;

public abstract class Employee {
	private String employeeid;
	private String name;
	public Employee(String employeeid, String name) {
		super();
		this.employeeid = employeeid;
		this.name = name;
	}
	public abstract double calculateSalary();
	public abstract void displayDetails();
	protected void  printBasicInfo() {
		System.out.println("Employee ID : "+employeeid);
		System.out.println("Employee Name : "+name);
	}
}
