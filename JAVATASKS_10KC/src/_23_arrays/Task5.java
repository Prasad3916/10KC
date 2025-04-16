package _23_arrays;

public class Task5 {
	
	void display() {
		boolean[] b=new boolean[2];
		b[0]=true;	
		b[1]=false;
		
		for(int i=0;i<b.length;i++) {
			System.out.println("Element At "+i+" Index : "+b[i]);
		}
	}

	public static void main(String[] args) {
		Task5 t5=new Task5();
		t5.display();
	}

}
