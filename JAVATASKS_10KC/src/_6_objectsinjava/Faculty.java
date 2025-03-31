package _6_objectsinjava;
public class Faculty {
    static String universityName="Stand University";
    String facultyName;
    String department;
    void displayDetails(String faculty,String department){
        System.out.println("University Name : "+universityName);
        System.out.println("Faculty Name : "+faculty);
        System.out.println("Department: " +department);
        System.out.println("--------------------------------");
    }
    public static void main(String[] args) {
        Faculty obj=new Faculty();
        obj.facultyName="Dr.Robert Brown";
        obj.department="Computer Science";
        obj.displayDetails(obj.facultyName, obj.department);
        obj.facultyName="Dr.Lisa Green";
        obj.department="Physics";
        obj.displayDetails(obj.facultyName, obj.department);
    }
}