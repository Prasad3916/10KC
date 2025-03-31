package _15_loops;
public class ArmStrong_Number {
	static String checkingArmStrongNumberOrNot(int num) {
		int count=0;
		int temp=num;
		int temp1=temp;
		int sum=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		while(temp!=0) {
			int rem=temp%10;
			int res=1;
			for(int i=1;i<=count;i++) {
				res=res*rem;
			}
			sum+=res;
			temp/=10;
		}
		return (temp1==sum)?"ArmStrong Number":"Not ArmStrong Number";
	}
	public static void main(String[] args) {
		System.out.println(checkingArmStrongNumberOrNot(153));
	}

}



