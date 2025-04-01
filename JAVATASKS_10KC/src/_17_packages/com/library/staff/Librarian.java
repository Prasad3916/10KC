package _17_packages.com.library.staff;
public class Librarian {
	private String librarianname;
	private int yearsofexperience;
	public String getLibrarianname() {
		return librarianname;
	}
	public void setLibrarianname(String librarianname1) {
		librarianname = librarianname1;
	}
	public int getYearsofexperience() {
		return yearsofexperience;
	}
	public void setYearsofexperience(int yearsofexperience1) {
		yearsofexperience = yearsofexperience1;
	}
	public void showLibrarianDetails() {
		System.out.println("Librarian Name "+getLibrarianname());
		System.out.println("Years Of Experience "+getYearsofexperience());
	}
}
