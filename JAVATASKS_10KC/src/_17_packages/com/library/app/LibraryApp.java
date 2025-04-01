package _17_packages.com.library.app;
import _17_packages.com.library.books.Library;
import _17_packages.com.library.staff.Librarian;

public class LibraryApp {
	public static void main(String[] args) {
		Library lib=new Library();
		Librarian lib1=new Librarian();
		lib.setLibraryname("MIC COLLEGE");
		lib.setTotalbooks(99999);
		lib1.setLibrarianname("ABC");
		lib1.setYearsofexperience(9);
		lib.showLibraryDetails();
		lib1.showLibrarianDetails();
	}
	
}

