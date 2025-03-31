package _15_loops;
public class ArmStrong_Number2 {
	
	
	
	 int getCount(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		return count;
	}
	 int getPower(int num,int exp) {
		int pow=1;
		for(int i=1;i<=exp;i++) {
			pow*=num;
		}
		return pow;
	}
	 boolean checkingArmStrongNumberOrNot(int num) {
		int count=getCount(num);
		int temp=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			int pow=getPower(rem, count);
			sum=sum+pow;
			num/=10;
		}
		return (temp==sum)?true:false;

	}
	public static void main(String[] args) {
		for(int i=1;i<=10000;i++) {
			boolean res=new ArmStrong_Number2().checkingArmStrongNumberOrNot(i);
			if(res) {
				System.out.println(i);
			}
		}
	}

}



