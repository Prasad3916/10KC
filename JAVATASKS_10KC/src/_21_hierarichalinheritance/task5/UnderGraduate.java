package _21_hierarichalinheritance.task5;

public class UnderGraduate extends Student{
	String major;
	UnderGraduate(String name,String studentid,String major){
		super(name,studentid);
		this.major=major;
	}
	void displayUnderGraduateInfo() {
		System.out.println("Major "+major);
		
	}

}
