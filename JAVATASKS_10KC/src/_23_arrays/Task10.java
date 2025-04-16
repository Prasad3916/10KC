package _23_arrays;

public class Task10 {
	
	void display() {
		short[] s=new short[4];
		s[0]=100;	
		s[1]=200;
		s[2]=300;	
		s[3]=400;
		int index=0;
		for (short item : s) {
			System.out.println("Element At "+index+" Index : "+item);
			index++;
		}
	}

	public static void main(String[] args) {
		Task10 t10=new Task10();
		t10.display();
	}

}
