package _21_hierarichalinheritance.task5;

public class Student {
	String name;
	String studentid;
	Student(String name,String studentid){
		this.name=name;
		this.studentid=studentid;
	}
	void displaystudentinfo() {
		System.out.println("Name : "+name);
		System.out.println("Student ID : "+studentid);
	}

}
