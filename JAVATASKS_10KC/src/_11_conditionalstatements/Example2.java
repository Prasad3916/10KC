package _11_conditionalstatements;

public class Example2 {
	String checkNumber(int num) {
		if(num>0) {
			return "Positive";
		}
		if(num<0) {
			return "Negative";
		}
		return "Negative";
			
		
	}
	public static void main(String[] args) {
		Example2 e2=new Example2();
		String res1=e2.checkNumber(10);
		String res2=e2.checkNumber(-10);
		String res3=e2.checkNumber(0);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);

	}
}
