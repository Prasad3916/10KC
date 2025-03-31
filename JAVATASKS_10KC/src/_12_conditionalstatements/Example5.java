package _12_conditionalstatements;

public class Example5 {
	boolean canVote(int age) {
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
	}
		
	public static void main(String[] args) {
		Example5 e5=new Example5();
		boolean res1=e5.canVote(18);
		if(res1) {
			System.out.println("Eligible For Vote");
		}
		else {
			System.out.println("Not Eligible For Voting");
		}
	}
}
