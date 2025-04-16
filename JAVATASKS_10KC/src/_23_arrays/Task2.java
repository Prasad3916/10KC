package _23_arrays;

public class Task2 {
	void strArray() {
		String[] s=new String[4];
		s[0]="John";	
		s[1]="Alice";
		s[2]="Bob";
		s[3]="Emma";
		int index=0;
		for (String item : s) {
			System.out.println("Element At "+index+" Index : "+item);
			index++;
		}
	}
	
	public static void main(String[] args) {
		
		Task2 t2=new Task2();
		t2.strArray();
		
	}

}
