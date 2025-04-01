package _17_packages.com.library.books;

public class Library {

	private String libraryname;
	private int totalbooks;
	public String getLibraryname() {
		return libraryname;
	}
	public void setLibraryname(String libraryname1) {
		libraryname = libraryname1;
	}
	public int getTotalbooks() {
		return totalbooks;
	}
	public void setTotalbooks(int totalbooks1) {
		totalbooks = totalbooks1;
	}
	
	public void showLibraryDetails() {
		System.out.println("Library Name "+getLibraryname());
		System.out.println("Total Books "+getTotalbooks());
	}
}
