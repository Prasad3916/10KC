package _27_exceptionhandling.task3;
public class InsufficientFundsException extends RuntimeException{
	public InsufficientFundsException(String str) {
		super(str);
	}
}
