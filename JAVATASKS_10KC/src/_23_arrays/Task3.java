package _23_arrays;

public class Task3 {
	
	void display() {
		double[] d=new double[3];
		d[0]=10.5;	
		d[1]=20.75;
		d[2]=30.25;
		for(int i=0;i<d.length;i++) {
			System.out.println("Element At "+i+" Index : "+d[i]);
		}
	}

	public static void main(String[] args) {
		Task3 t3=new Task3();
		t3.display();
	}

}
