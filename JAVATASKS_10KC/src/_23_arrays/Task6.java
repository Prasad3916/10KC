package _23_arrays;

public class Task6 {
	
	void display() {
		boolean[] b=new boolean[2];
		b[0]=true;	
		b[1]=false;
		
		int index=0;
		for (boolean item : b) {
			System.out.println("Element At "+index+" Index : "+item);
			index++;
		}
	}

	public static void main(String[] args) {
		Task6 t5=new Task6();
		t5.display();
	}

}
