package _7_java_instance_static_methods;
public class Student{
    int studentId;
    static String schoolName;
    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student();
        student1.studentId=student1.studentId+5;
        Student.schoolName="Central High";
        student2.studentId=student1.studentId+20;
        System.out.println("After modification:");
        System.out.println("student1.studentId: " + student1.studentId);
        System.out.println("student2.studentId: " + student2.studentId);
        System.out.println("Using student1: " + student1.schoolName);
        System.out.println("Using student2: " + student2.schoolName);
        System.out.println("Using Student: " + Student.schoolName);
        student1.schoolName = "Northview Academy";
        System.out.println("After modifying static variable using student1:");
        System.out.println("student1.schoolName: " + student1.schoolName);
        System.out.println("student2.schoolName: " + student2.schoolName);
        System.out.println("Student.schoolName: " +Student.schoolName);   
    }
}