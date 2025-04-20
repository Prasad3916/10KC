package _25_arrays;
public class Student {
	int rollno;
	String name;
	Course[]c=new Course[3];
	public Student(int rollno, String name, Course[] c) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.c = c;
	}
	double getOverAllAverageScore(Course[] c) {
		double sum=0;
		int noofsubjects=0;
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].marks.length;j++) {
				sum+=c[i].marks[j];
				noofsubjects++;
			}
		}
		return sum/noofsubjects;
	}
	void displayStudentPerformance(Course[] c) {
		double sum=0;
		int noofsubjects=0;
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].marks.length;j++) {
				sum+=c[i].marks[j];
				noofsubjects++;
				
			}
			System.out.println("Course Wise Average of "+c[i].coursename+" is : "+sum/noofsubjects);
			sum=0;
			noofsubjects=0;
		}
	}
	public static void main(String[] args) {
		Course c1=new Course("EEE",new int[]{77,89,87,90});
		Course c2=new Course("CSE",new int[]{89,87,89,90});
		Course c3=new Course("IT",new int[]{89,90,87,68});
		Course c4=new Course("PFS",new int[]{87,98,87,98});
		Course c5=new Course("JFS",new int[]{87,100,89,89});
		Course c6=new Course("AIML",new int[]{87,98,67,89});
		Course[] arr1= {c1,c2,c3};
		Course[] arr2= {c4,c5,c6};
		Student s1=new Student(101,"ABC",arr1);
		Student s2=new Student(102,"XYZ",arr2);
		Student s[]= {s1,s2};
		for(Student ele:s) {
			System.out.println("Roll NO : "+ele.rollno);
			System.out.println("Student Name : "+ele.name);
			ele.displayStudentPerformance(ele.c);
			System.out.println("Over All Average Score : "+ele.getOverAllAverageScore(ele.c));
		}
	}
}
