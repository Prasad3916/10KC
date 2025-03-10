package _11_conditionalstatements;

public class Example3 {
	boolean canVote(int age) {
		if(age>=18) {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		Example3 e3=new Example3();
		boolean res1=e3.canVote(17);
		boolean res2=e3.canVote(19);
		boolean res3=e3.canVote(19);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}
}
