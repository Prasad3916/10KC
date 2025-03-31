package _7_java_instance_static_methods;
public class BankAccount {
    double accountBalance;
    static String bankName;
    public static void main(String[] args) {
        BankAccount account1=new BankAccount();
        BankAccount account2=new BankAccount();
        account1.accountBalance=account1.accountBalance+150;
        BankAccount.bankName="Global Bank";
        account2.accountBalance=account1.accountBalance+300;
        System.out.println("After modification:");
        System.out.println("account1.accountBalance: " + account1.accountBalance);
        System.out.println("account2.accountBalance: " + account2.accountBalance);
        System.out.println("Using account1: " + account1.bankName);
        System.out.println("Using account2: " + account2.bankName);
        System.out.println("Using BankAccount: " + BankAccount.bankName);
        account1.bankName = "First National Bank";
        System.out.println("After modifying static variable using account1:");
        System.out.println("account1.bankName: " + account1.bankName);
        System.out.println("account2.bankName: " + account2.bankName);
        System.out.println("BankAccount.bankName: " +BankAccount.bankName);   
    }
}