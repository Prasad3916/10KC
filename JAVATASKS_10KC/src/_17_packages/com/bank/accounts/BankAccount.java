package _17_packages.com.bank.accounts;

public class BankAccount {
	private String accountnumber;
	private double balance;
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber1) {
		accountnumber = accountnumber1;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance1) {
		balance = balance1;
	}
	public void showAccountDetails() {
		System.out.println("Account Number "+getAccountnumber());
		System.out.println("Account Balance "+getBalance())	;
	}
}
