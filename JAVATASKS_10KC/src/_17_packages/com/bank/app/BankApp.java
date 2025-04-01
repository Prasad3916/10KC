package _17_packages.com.bank.app;
import _17_packages.com.bank.accounts.BankAccount;
import _17_packages.com.bank.customers.Customer;

public class BankApp {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		Customer cm=new Customer();
		ba.setAccountnumber("3772487287");
		ba.setBalance(9999999);
		cm.setCustomername("PAMBI BHAVANI PRASAD");
		cm.setCustoomerid("101");
		cm.showCustomerDetails();
		ba.showAccountDetails();
		
	}

}
