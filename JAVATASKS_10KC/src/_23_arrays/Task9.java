package _23_arrays;

public class Task9 {
	
	void display() {
		long[] l=new long[3];
		l[0]=100000L;	
		l[1]=200000L;
		l[2]=300000L;		
		for(int i=0;i<l.length;i++) {
			System.out.println("Element At "+i+" Index : "+l[i]);
		}
	}

	public static void main(String[] args) {
		Task9 t9=new Task9();
		t9.display();
	}

}
