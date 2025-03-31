//Program 1
package _8_java_instance_methods;
public class Employee {
	String employeeName;
    int employeeId;
    double employeeSalary;
    void addEmployeeDetails(String name,int id,double sal){
        employeeName=name;
        employeeId=id;
        employeeSalary=sal;
    }
    String displayDetails(){
        return ("EmployeeName : "+employeeName+", EmployeeId : "+employeeId+", EmployeeSalary : "+employeeSalary);
    }
    public static void main(String[] args) {
        Employee e=new Employee();
        e.addEmployeeDetails("Prasad", 101, 39999);
        System.out.println(e.displayDetails());
        e.addEmployeeDetails("Venu", 102, 49999);
        System.out.println(e.displayDetails());
    }
}