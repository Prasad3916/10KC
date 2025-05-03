package _27_exceptionhandling.task3;

public class BankAccountScenario {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount(10000);
		try {
			ba.performTransaction(1000);
			System.out.println("Withdrawl Successfully Remaining balance "+ba.getBalance());
			ba.withdraw(4000);
			System.out.println("Withdrawl Successfully Remaining balance "+ba.getBalance());
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	

}
