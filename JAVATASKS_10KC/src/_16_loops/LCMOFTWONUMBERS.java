package _16_loops;

public class LCMOFTWONUMBERS {
		
	static int displayLcmOfTwoNumbers(int a,int b) {
		int max=(a>b)?a:b;
		for(int i=max;;i+=max) {
			if(i%a==0 && i%b==0) {
				return i;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(displayLcmOfTwoNumbers(20, 50));
	}
}
