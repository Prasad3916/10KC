package _28_multithreading;
public class Task1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello Wolrd From My Thread");
		}
	}
	public static void main(String[] args) {
		
		Thread task1 = new Task1();
		task1.start();
	}
}
