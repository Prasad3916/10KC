package _14_loops;
public class Example3 {
	void asciiValuesLowerCaseAndUpperCase() {
		System.out.println();
		for(int i='A';i<='z';i++) {
			if(Character.isLetter((char) i)) {
				System.out.print(((char) i )+ " : "+i+",");
			}
		}
	}
	public static void main(String[] args) {
		Example3 e1=new Example3();
		e1.asciiValuesLowerCaseAndUpperCase();
		
		
	}

}
