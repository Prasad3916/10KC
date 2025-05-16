package _29_multithreading;
class BankAccount {
	public double balance=5000;
	synchronized public void withdraw(int amount) {
			System.out.println("Withdrawing Balance "+Thread.currentThread().getName() +": "+amount);
			if(amount<=balance) {
			balance-=amount;
			System.out.println("Withdrawl Successfull "+amount+" Current Amount "+Thread.currentThread().getName() +" : "+balance);
			}
			else {
				System.out.println("Invalid Amount");
			}
	}
	 synchronized public void deposit(int amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposit Successfully "+amount+" Current Amount Of "+Thread.currentThread().getName() +" : "+balance);
		}
		else {
			System.out.println("Invalid Amount");
		}
}
}	
class CustomerThread extends Thread{
	BankAccount b;
	int wamount;
	int damount;
	CustomerThread(BankAccount ba,int wamount,int damount){
		b=ba;
		this.wamount=wamount;
		this.damount=damount;
	}
	 public void run() {
		b.deposit(damount);
		b.withdraw(wamount);
	}
}
public class Main{
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();	
		new CustomerThread(bankAccount,3000,4000).start();
		new CustomerThread(bankAccount,4000,5000).start();
	}
}

