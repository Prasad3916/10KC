package _17_packages.com.company.admin; 
public class Department {
	private String deptname;
	private int deptid;
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname1) {
		deptname = deptname1;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid1) {
		deptid = deptid1;
	}
	public void showDepartmentDetails() {
		System.out.println("Department Name "+getDeptname());
		System.out.println("Depertment Id "+getDeptid());
	}
}

