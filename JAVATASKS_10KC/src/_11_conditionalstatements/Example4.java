package _11_conditionalstatements;

public class Example4 {
	int findGreater(int num1,int num2) {
		if(num1>num2) {
			return num1;
		}
		if(num2>num1) {
				return num2;
				
			}
		return num1 | num2;
		}
	
	public static void main(String[] args) {
		Example4 e4=new Example4();
		int res1=e4.findGreater(10,20);
		int res2=e4.findGreater(30,20);
		int res3=e4.findGreater(20,20);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}
}
