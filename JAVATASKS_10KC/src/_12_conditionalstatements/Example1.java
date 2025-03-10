package _12_conditionalstatements;

public class Example1 {
	
		boolean isEvenOrOdd(int num) {
			if(num%2==0) {
				return true;
			}
			else {
				return false;
			}
		}

		public static void main(String[] args) {
			Example1 e1=new Example1();
			boolean res1=e1.isEvenOrOdd(999);
			boolean res2=e1.isEvenOrOdd(1);
			boolean res3=e1.isEvenOrOdd(0);
			System.out.println(res1);
			System.out.println(res2);
			System.out.println(res3);
		}
}
