package _29_multithreading;
class NumberPrinter implements Runnable{
	private int start;
	private int end;
	NumberPrinter(int start,int end){
		this.start=start;
		this.end=end;
	}
	@Override
	public void run() {
			if(start%2==0) {
				for(int i=start;i<=end;i++) {
					if(i%2==0) {
						System.out.println(Thread.currentThread().getName()+" "+i);
					}
			}
			}
			else {
				for(int i=start;i<=end;i++) {
					if(i%2!=0) {
						System.out.println(Thread.currentThread().getName()+" "+i);
				}
			}

		}
	}
}
public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		Runnable EvenNumber=new NumberPrinter(2,20);
		Runnable OddNumber=new NumberPrinter(1,19);
		Thread t1=new Thread(EvenNumber);
		Thread t2=new Thread(OddNumber);
		t1.start();
		t1.join();
		t2.start();
	}
}
