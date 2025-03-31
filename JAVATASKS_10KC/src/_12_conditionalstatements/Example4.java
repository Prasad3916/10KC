package _12_conditionalstatements;

public class Example4 {
	
	
		int largestAmongThreeNumbers(int num1,int num2,int num3) {
			if(num1>num2 && num1>num3) {
				return num1;
			}
			else {
				if(num2>num1 && num2 > num3) {
					return num2;
				}
				else {
					if(num3>num1 && num3>num2) {
						return num3;
					}
					else {
						return 0;
					}
				}
			}
		}

	public static void main(String[] args) {
		Example4 e4=new Example4();
		int num1=100;
		int num2=200;
		int num3=300;
		int res1=e4.largestAmongThreeNumbers(num1, num2,num3);
		if(res1==num1) {
			System.out.println("num1 is Big");
		}
		else {
			if(res1==num2)
				System.out.println("num2 is big");
			else {
				if(res1==num3) {
					System.out.println("num3 is big");
				}
				else {
					System.out.println("In Valid There May Be a Equal of Atleast Two Numbers ");
				}
			}
		}
		
	}
}
