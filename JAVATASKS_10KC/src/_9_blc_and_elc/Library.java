package _9_blc_and_elc;
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Book b1=new Book();
	Book b2=new Book();
	b1.setbookId(101);
	b1.setauthor("Book1");
    b1.settitle("Hai................");
	b1.setprice(100);
	b2.setbookId(102);
	b2.setauthor("Book2");
    b2.settitle("Hello..............");;
	b2.setprice(100);
	System.out.println(b1.getbookId());
	System.out.println(b1.gettitle());
	System.out.println(b1.getauthor());
	System.out.println(b1.getprice());
	System.out.println(b2.getbookId());
	System.out.println(b2.gettitle());
	System.out.println(b2.getauthor());
	System.out.println(b2.getprice());
	
		
	}

}
