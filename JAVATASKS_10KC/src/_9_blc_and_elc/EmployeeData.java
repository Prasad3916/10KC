package _9_blc_and_elc;

public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee b1=new Employee();
		Employee b2=new Employee();
		b1.setemployeeId(101);
		b1.setemployeeName("Prasad");
		b1.setsalary(100000);
		b2.setemployeeId(102);
		b2.setemployeeName("Venu");
		b2.setsalary(1000000);
		System.out.println(b1.getemployeeId());
		System.out.println(b1.getemployeeName());
		System.out.println(b1.getsalary());
		System.out.println(b2.getemployeeId());
		System.out.println(b2.getemployeeName());
		System.out.println(b2.getsalary());

	}

}

