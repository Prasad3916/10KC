package _28_multithreading;
public class Task2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Runnable Thread Is Running");
		}
	}
	public static void main(String[] args) {
			Runnable run=new Task2();
			new Thread(run).start();
	}
}
