package _21_hierarichalinheritance.task5;

public class Graduate extends Student{
	String thesistopic;
	
	Graduate(String name,String studentid,String thesistopic){
		super(name,studentid);
		this.thesistopic=thesistopic;
	}
	void displayGraduateInfo() {
		System.out.println("Thesis Topic "+thesistopic);

	}

}
