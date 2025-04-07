package _18_constructors;
public class LibrarySystem {
	public static void main(String[] args) {
		Book b=new Book(101,"Premam",3);
		int res=b.getAvailablecopies();
		System.out.println(res);
		
		for(int i=0;i<=res;i++) {
			b.borrowBook();
		}
		for(int i=1;i<=res;i++) {
			b.returnBook();
			if(i==res) {
				System.out.println("Library Transactions Completed");
			}
		}
		 

		
	
}

}