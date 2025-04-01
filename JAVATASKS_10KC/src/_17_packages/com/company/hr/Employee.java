package _17_packages.com.company.hr;
public class Employee {
	private String name;
	private int id;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name1) {
		name = name1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id1) {
		id = id1;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary1) {
		salary = salary1;
	}
	public void showEmployeeDetails() {
		System.out.println("Employee id "+getId());
		System.out.println("Employee Name "+getName());
		System.out.println("Employee Salary Location "+getSalary());

	}
}
