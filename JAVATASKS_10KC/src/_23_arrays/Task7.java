package _23_arrays;

public class Task7 {
	
	void display() {
		String[] s=new String[3];
		s[0]="Delhi";	
		s[1]="Mumbai";
		s[2]="Mumbai";		
		for(int i=0;i<s.length;i++) {
			System.out.println("Element At "+i+" Index : "+s[i]);
		}
	}

	public static void main(String[] args) {
		Task7 t7=new Task7();
		t7.display();
	}

}
