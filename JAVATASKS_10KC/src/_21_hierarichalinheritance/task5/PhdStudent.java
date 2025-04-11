package _21_hierarichalinheritance.task5;

public class PhdStudent extends Student{
	
	String researcharea;
	PhdStudent(String name,String studentid,String researcharea){
		super(name,studentid);
		this.researcharea=researcharea;
	}
	
	void displayPhdStudentInfo() {
		System.out.println("Research Area "+researcharea);

	}

}
