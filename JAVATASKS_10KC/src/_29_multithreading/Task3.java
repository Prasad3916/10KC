package _29_multithreading;
public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello");
			}
		});
		Thread t2=new Thread(()->System.out.println("World"));
		t1.start();
		t1.join();
		t2.start();
	}
}
