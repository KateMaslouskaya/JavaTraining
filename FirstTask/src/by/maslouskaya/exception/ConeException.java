package by.maslouskaya.exception;

@SuppressWarnings("serial")
public class ConeException extends Exception {
	public ConeException() {
	}
	
	public ConeException(String message, Throwable exception) {
		super(message, exception);
	}
	
	public ConeException(String message) {
		super(message);
	}
	
	public ConeException(Throwable exception) {
		super(exception);
	}
}
