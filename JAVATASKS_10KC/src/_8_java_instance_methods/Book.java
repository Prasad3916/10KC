
//Program 3
package _8_java_instance_methods;
public class Book {
    String bookTitle;
    String author;
    short isbn;
    void addBookDetails(String btitle,String bauthor,short bn){
       bookTitle=btitle;
       author=bauthor;
       isbn=bn;
    }
    String displayDetails(){
       return ("bookTitle : "+bookTitle+", author : "+author+", isbn : "+isbn);
    }
   public static void main(String[] args) {
       Book b=new Book();
       short s=10109;
       b.addBookDetails("AmmaNanna","Prasad",s);
       System.out.println(b.displayDetails());
   }
}
