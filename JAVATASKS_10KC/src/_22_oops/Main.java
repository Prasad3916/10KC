package _22_oops;

public class Main {
	
	public static void main(String[] args) {
		FacultyMember fm=new FacultyMember("101","Prasad",101,9);
		StaffMember sm=new StaffMember("102","Venu","SD",10);
		fm.displayDetails();
		System.out.println("Faculty Member Salary : "+fm.calculateSalary());
		sm.displayDetails();
		System.out.println("Staff Member Salary : "+sm.calculateSalary());
	}

}
