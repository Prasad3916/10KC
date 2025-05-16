package _28_multithreading;

public class NumberPrinter implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		new Thread(new NumberPrinter()).start();
	}


}
