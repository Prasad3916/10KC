package _14_loops;
public class Example4 {
	int  lcmOfTwoNumbers(int a,int b) {
		
		int max_number=a>b?a:b;
		for(int i=max_number;;i+=max_number) {
			if(i%a==0 && i%b==0) {
				return i;
			}
		}
	}
	public static void main(String[] args) {
		Example4 e1=new Example4();
		System.out.println(e1.lcmOfTwoNumbers(3,15));
		
		
	}

}
