package exceptions;

public class NonExistentAccountException extends Exception{
	NonExistentAccountException(String x) {
		super(x);
	}
}
