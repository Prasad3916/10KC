package _29_multithreading;
class Printer{
	int paperCount;
	Printer(int p){
		this.paperCount=p;
	}
	synchronized void printDocument(String document,String userName) {
		if(paperCount>0) {
			paperCount-=1;
			System.out.println(userName+" "+document);
			System.out.println("Successfully Printed");
			System.out.println("Remaining Papers "+paperCount);
			System.out.println("-----------------------------------------------");
		}
		else {
			System.out.println("Sorry "+userName+" Printing Cannot Proceed");
		}
	}
}
class User extends Thread{
	String name;
	Printer printer;
	String document;
	User(String name,Printer printer,String document){
		this.name=name;
		this.printer=printer;
		this.document=document;
	}
	public void run() {
		printer.printDocument(document, name);
	}
}
public class PrinterSimulation {
	public static void main(String[] args) {
		Printer printer =new Printer(5);
		new User("Bhavani Prasad",printer,"Java").start();
		new User("Prasad",printer,"Python").start();
		new User("Venu",printer,"Data Science").start();
		new User("Satish",printer,"AI").start();
		new User("Ammeruddin",printer,"ML").start();
		new User("Sai Kiran",printer,"MERN Stack").start();

	}

}
