package _23_arrays;

public class Task4 {
	
	void display() {
		char[] c=new char[5];
		c[0]=65;	
		c[1]=66;
		c[2]=67;
		c[3]=68;
		c[4]=69;
		int index=0;
		for (char item : c) {
			System.out.println("Element At "+index+" Index : "+item);
			index++;
		}
	}

	public static void main(String[] args) {
		Task4 t4=new Task4();
		t4.display();
	}

}
