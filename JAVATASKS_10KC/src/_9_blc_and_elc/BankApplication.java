package _9_blc_and_elc;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	BankAccount b1=new BankAccount();
	BankAccount b2=new BankAccount();
	b1.setAccountNumber(101);
	b1.setAccountHolderName("Prasad");
	b1.setBalance(100000);
	b2.setAccountNumber(102);
	b2.setAccountHolderName("Venu");
	b2.setBalance(100000);
	System.out.println(b1.getAccountNumber());
	System.out.println(b1.getAccountHolderName());
	System.out.println(b1.getBalance());
	System.out.println(b2.getAccountNumber());
	System.out.println(b2.getAccountHolderName());
	System.out.println(b2.getBalance());
	
		
	}

}
