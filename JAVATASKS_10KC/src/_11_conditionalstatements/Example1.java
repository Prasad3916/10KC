package _11_conditionalstatements;

public class Example1 {
	
	
	boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
			return false;
		
	}
	public static void main(String args[]) {
		Example1 e=new Example1();
		boolean res=e.isEven(100);
		System.out.println(res);
	}
}
