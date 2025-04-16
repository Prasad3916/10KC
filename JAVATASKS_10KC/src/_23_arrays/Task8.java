package _23_arrays;

public class Task8 {
	
	void display() {
		float[] f=new float[4];
		f[0]=1.1f;	
		f[1]=2.2f;
		f[2]=3.3f;	
		f[3]=4.4f;
		int index=0;
		for (float item : f) {
			System.out.println("Element At "+index+" Index : "+item);
			index++;
		}
	}

	public static void main(String[] args) {
		Task8 t8=new Task8();
		t8.display();
	}

}
