package _17_packages.com.school.management;

public class School {
	private String name;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name1) {
		name = name1;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location1) {
		location = location1;
	}
	public void showSchoolInfo() {
		System.out.println("School Name "+getName());
		System.out.println("School Location "+getLocation());
	}
}
