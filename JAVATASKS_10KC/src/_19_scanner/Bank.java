package _19_scanner;

public class Bank {

	private String customerName;
	private String customerAddress;
	private long phoneNumber;
	private double balance;
	int option;
	public Bank(String customerName,String customerAddress,long phoneNumber,double balance) {
		this.customerName=customerName;
		this.customerAddress=customerAddress;
		this.phoneNumber=phoneNumber;
		this.balance=balance;
		System.out.println("Account Created Successfully");
	}
	public void deposit(double d) {
		if(d>0) {
			balance+=d;
			System.out.println("Deposit Successfully Available balance id "+balance);
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	public void withdraw(double d) {
		if(d>balance || d<=500) {
			System.out.println("Minimum Withdrwal should be 500 Balance");
		}
		else {
			balance-=d;
			System.out.println("Withdrawl Successfull remaining balance id "+balance);
		}
		}
	public void showBalance() {
		System.out.println("Current Balance "+balance);
		
	}


}
