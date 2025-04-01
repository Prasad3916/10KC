package _17_packages.com.company.app;
import _17_packages.com.company.admin.Department;
import _17_packages.com.company.hr.Employee;

public class CompanyApp {

	public static void main(String[] args) {
		Department d=new Department();
		Employee e=new Employee();
		d.setDeptid(101);
		d.setDeptname("Computer Science Engineering");
		e.setId(1);
		e.setName("Prasad");
		e.setSalary(90000);
		d.showDepartmentDetails();
		e.showEmployeeDetails();
	}

}
