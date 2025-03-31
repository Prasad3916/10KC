package _9_blc_and_elc;

public class Student {
	private int id;
	private int rollno;
	private String name;
	
	public static Student getStudentDetails(int id,int rollno,String  name) {
		
		Student s1=new Student();
		s1.setId(id);
		s1.setRollno(rollno);
		s1.setName(name);
		return s1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id1) {
		id = id1;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno1) {
		rollno = rollno1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name1) {
		name = name1;
	}
}
