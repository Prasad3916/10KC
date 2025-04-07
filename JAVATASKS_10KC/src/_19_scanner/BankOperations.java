package _19_scanner;
import java.util.Scanner;
public class BankOperations {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Your Name ");
		String name=s.nextLine();
		System.out.print("Enter Your Address ");
		String address=s.nextLine();
		System.out.print("Enter Your Phone Number ");
		long phonenumber=s.nextLong();
		System.out.print("Enter Your Initial Deposit Balance ");
		double balance=s.nextDouble();
		Bank b=new Bank(name,address,phonenumber,balance);
		int option;
		do {
			System.out.println("*****Select Your Option*****");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.print("Enter Your Option [1-4] ");
			option=s.nextInt();
				if(option==1) {
					System.out.print("Enter Your Withdraw Balance ");
					double w=s.nextDouble();
					b.withdraw(w);
				}
				else if(option==2){
					System.out.print("Enter Your Deposit Money ");
					double d=s.nextDouble();
					b.deposit(d);
				}
				else if(option==3) {
					b.showBalance();
				}
				else if(option==4) {
					System.out.println("Thank You Visit Again");
				}
				else {
					System.out.println("Invalid Option");
				}
		}while(option!=4);
		s.close();
	}

}