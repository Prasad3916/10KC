package _17_packages.com.school.staff; 
public class Principal {
	private String principlename;
	private int experienceyears;
	public String getPrinciplename() {
		return principlename;
	}
	public void setPrinciplename(String principlename1) {
		principlename = principlename1;
	}
	public int getExperienceyears() {
		return experienceyears;
	}
	public void setExperienceyears(int experienceyears1) {
		experienceyears = experienceyears1;
	}
	public void showPrincipalInfo() {
		System.out.println("Prinicipal Name "+getPrinciplename());
		System.out.println("Experience "+getExperienceyears());
	}
}
