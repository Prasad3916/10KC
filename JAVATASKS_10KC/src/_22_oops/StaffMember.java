package _22_oops;

public class StaffMember extends Employee{
	
	private String designation;
	private double overtimehours;
	public StaffMember(String employeeid,String name,String designation, double overtimehours) {
		super(employeeid,name);
		this.designation = designation;
		this.overtimehours = overtimehours;
	}
	public double calculateSalary() {
		double basesalary=50000;
		double salary=25*overtimehours;
		return basesalary+salary;
	}
	
	public void displayDetails() {
		super.printBasicInfo();
		System.out.println("Designation : "+designation);
		System.out.println("Over Time Hours : "+overtimehours);
		
	}

}
