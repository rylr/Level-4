package exceptions;

public class PreviouslyExistingAccountException extends Exception{
	PreviouslyExistingAccountException(String x) {
		super(x);
	}
}
