package _21_hierarichalinheritance.task5;

public class Main {
	
	public static void main(String[] args) {
		Student s;
		s=new UnderGraduate("Alice","12345","Computer Science Engineering");
		s.displaystudentinfo();
		((UnderGraduate)s).displayUnderGraduateInfo();

		s=new Graduate("Bob","123456","Machine Learning");
		s.displaystudentinfo();
		((Graduate)s).displayGraduateInfo();

		s=new PhdStudent("Charlie","1234567","Artificial Intelligence");
		s.displaystudentinfo();
		((PhdStudent)s).displayPhdStudentInfo();

	}

}
