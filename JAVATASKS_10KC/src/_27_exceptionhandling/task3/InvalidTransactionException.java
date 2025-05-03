package _27_exceptionhandling.task3;
public class InvalidTransactionException extends Exception{
	public InvalidTransactionException(String str) {
		super(str);
	}
}
