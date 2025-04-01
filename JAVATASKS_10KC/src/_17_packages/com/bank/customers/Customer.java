package _17_packages.com.bank.customers;

public class Customer {
	private String customername;
	private String custoomerid;
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername1) {
		customername = customername1;
	}
	public String getCustoomerid() {
		return custoomerid;
	}
	public void setCustoomerid(String custoomerid1) {
		custoomerid = custoomerid1;
	}
	public void showCustomerDetails() {
		System.out.println("Customer Name "+getCustomername());
		System.out.println("Customer Id "+getCustoomerid());
	}
	
}
