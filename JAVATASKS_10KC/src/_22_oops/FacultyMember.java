package _22_oops;

public class FacultyMember extends Employee{
	
	private int departmentcode;
	private int yearsofservice;
	public FacultyMember(String employeeid,String name,int departmentcode, int yearsofservice) {
		super(employeeid,name);
		this.departmentcode = departmentcode;
		this.yearsofservice = yearsofservice;
	}
	
	public void displayDetails() {
		super.printBasicInfo();
		System.out.println("Department Code : "+departmentcode);
		System.out.println("Years Of Service : "+yearsofservice);
		
	}
	public double calculateSalary() {
		
		double basesalary=50000;
		double experincebonus=1000*yearsofservice;
		return basesalary+experincebonus;
	}
	
	

}
