package _27_exceptionhandling.task3;
public class BankAccount {
	double balance;
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	void performTransaction(double amount)throws InvalidTransactionException {
		if(amount<0) {
			throw new InvalidTransactionException("Transaction Error: Transaction amount must be positive");
		}
		else if(amount>balance) {
			throw new InvalidTransactionException("Insufficient funds for the transaction");
		}
		else {
			this.balance=balance-amount;
		}
	}
	void withdraw(double amount){
		if(amount>balance) {
			throw new InsufficientFundsException("Withdrawal Error: Insufficient funds for withdrawal");
			
		}
		else if(amount<=0) {
			throw new IllegalArgumentException("Withdrawal Error: Withdrawal amount must be positive");
		}
		else {
			this.balance=this.balance-amount;
		}

	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
