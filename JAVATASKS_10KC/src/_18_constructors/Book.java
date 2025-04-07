package _18_constructors;
public class Book {
	private int bookid;
	private String title;
	private int availablecopies;
	public Book(int bookid,String title,int availablecopies) {
		this.bookid=bookid;
		this.title=title;
		this.availablecopies=availablecopies;
	}
	public int getBookid() {
		return bookid;
	}
	public String getTitle() {
		return title;
	}
	public int getAvailablecopies() {
		return availablecopies;
	}
	public void borrowBook() {
		System.out.println("Attempting To Borrow A Book");
		if(availablecopies>0) {
			availablecopies-=1;
			System.out.println("Book Borowed Successfully! Updated Available Copies : "+availablecopies);
		}
		else {
			System.out.println("Book Is Not Available For Borrowing");
		}
	}
	boolean flag=true;
	public void returnBook() {
		
			if(flag) {
				System.out.println("Attempting To Return A Book");
				availablecopies+=1;
				System.out.println("Book Returned Successfully! Updated Available Copies : "+availablecopies);
			}
			else {
				flag=false;
				System.out.println("Book Returned Successfully! Updated Available Copies : "+availablecopies);	
			}
	}
}
