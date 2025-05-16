package _28_multithreading;
public class ShowThreadName implements Runnable{
	public void run() {
		System.out.println("Thread Name : "+Thread.currentThread().getName());
	}
	public static 	void main(String[] args) {
		new Thread(new ShowThreadName(),"My New Thread").start();
		}
}
