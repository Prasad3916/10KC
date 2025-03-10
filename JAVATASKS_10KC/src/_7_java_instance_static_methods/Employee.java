package _7_java_instance_static_methods;
public class Employee {
    int employeeId;
    static String companyName;
    public static void main(String[] args) {
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        emp1.employeeId=emp1.employeeId+10;
        Employee.companyName="TechCorp";
        emp2.employeeId=emp1.employeeId+30;
        System.out.println("After modification:");
        System.out.println("emp1.employeeId: " + emp1.employeeId);
        System.out.println("emp2.employeeId: " + emp2.employeeId);
        System.out.println("Using emp1: " + emp1.companyName);
        System.out.println("Using emp2: " + emp2.companyName);
        System.out.println("Using Employee: " + Employee.companyName);
        emp1.companyName = "InnovateTech";
        System.out.println("After modifying static variable using emp1:");
        System.out.println("emp1.companyName: " + emp1.companyName);
        System.out.println("emp2.companyName: " + emp2.companyName);
        System.out.println("Employee.companyName: " +Employee.companyName);   
    }
}