package _13_conditionalstatements;

public class LoanApproval {
	
public String checkLoanApproval(double salary,int creditscore) {
	if(salary>80000 && creditscore>750) {
		return "Loan Approved Immediately";
	}
	else if(salary > 50000 && salary <=80000 && creditscore >650 && creditscore <=750) {
		return "Loan Approved With Higher Interest Rate";
	}
	else if(salary >3000 && salary <=50000 && creditscore >500 && creditscore<=650) {
		return "Co signer Required";
	}
	else {
		return "Loan Rejected";
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoanApproval lp=new LoanApproval();
		System.out.println(lp.checkLoanApproval(80010, 759));

	}

}
