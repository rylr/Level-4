package exceptions;

public class AccountOverdrawnException extends Exception{
	AccountOverdrawnException(String x) {
		super(x);
	}
}
