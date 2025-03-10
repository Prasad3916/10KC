package _9_blc_and_elc;
public class Employee {
    int employeeId;
    String employeeName;
    double salary;
    void setemployeeId(int pid){
        employeeId=pid;
    }
    void setemployeeName(String pname){
        employeeName=pname;
    }
    void setsalary(double psalary){
        salary=psalary;
    }

    int getemployeeId(){
        return employeeId;
    }
    String getemployeeName(){
        return employeeName;
    }
    double getsalary(){
        return salary;
    }
  
}