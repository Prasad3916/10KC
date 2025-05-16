package _28_multithreading;
class FirstThread extends Thread{
	public void run() {
		System.out.println("First Thread Message");
	}
}
class SecondThread extends Thread{
	public void run() {
		System.out.println("Second Thread Message");
	}
}
public class Task3 {
	public static void main(String[] args) {
//		Thread t1=new FirstThread();
//		t1.start();
//		Thread t2=new SecondThread();
//		t2.start();
		new FirstThread().start();
		new SecondThread().start();

	}
}
