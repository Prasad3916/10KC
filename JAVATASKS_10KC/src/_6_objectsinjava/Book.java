package _6_objectsinjava;
public class Book {
    static String libraryName="City Public Library";
    String title;
    String author;
    void displayDetails(String title,String author){
        System.out.println("Library Name : "+libraryName);
        System.out.println("Book Title : "+title);
        System.out.println("Book Author: " +author);
        System.out.println("--------------------------------");
    }
    public static void main(String[] args) {
        Book obj=new Book();
        obj.title="The Great Gatsby";
        obj.author="F. scott Fitzgerald";
        obj.displayDetails(obj.title, obj.author);
        obj.title="1984";
        obj.author="George Orwell";
        obj.displayDetails(obj.title, obj.author);
    }
}