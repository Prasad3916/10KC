package _11_conditionalstatements;

public class Example5 {
	boolean isDivisibleby5(int num) {
		if(num%5==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Example5 e5=new Example5();
		boolean res1=e5.isDivisibleby5(10);
		boolean res2=e5.isDivisibleby5(9);
		boolean res3=e5.isDivisibleby5(-10);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}
}
