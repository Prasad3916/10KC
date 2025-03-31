package _9_blc_and_elc;
public class StudentMain {

	public static void main(String[] args) {
		Student stu1=Student.getStudentDetails(01,39,"Bhavani Prasad");
		System.out.println(stu1.getId());
		System.out.println(stu1.getRollno());
		System.out.println(stu1.getName());
		Student stu2=Student.getStudentDetails(01,39,"Pambi Bhavani Prasad");
		System.out.println(stu2.getId());
		System.out.println(stu2.getRollno());
		System.out.println(stu2.getName()); 
	}
}
