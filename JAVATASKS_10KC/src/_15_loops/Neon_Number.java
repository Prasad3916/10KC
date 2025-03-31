package _15_loops;
public class Neon_Number {
	static String checkingNeonOrNot(int num) {
		int square=num*num;
		int sum=0;
		while(square!=0) {
			sum+=square%10;
			square/=10;	
		}
		return (sum==num)?"Neon Number":"Not Neon Number";		
	}
	public static void main(String[] args) {
		System.out.println(checkingNeonOrNot(9));
	}
}
