package _17_packages.com.school.app;
import _17_packages.com.school.management.School;
import _17_packages.com.school.staff.Principal;
public class SchoolApp {
	public static void main(String[] args) {
		School sc=new School();
		Principal pl=new Principal();
		sc.setName("Sri Sai EM High School");
		sc.setName("Vijayawada");
		pl.setPrinciplename("VenkateswaraRao");
		pl.setExperienceyears(20);
		sc.showSchoolInfo();
		pl.showPrincipalInfo();
	}
}
