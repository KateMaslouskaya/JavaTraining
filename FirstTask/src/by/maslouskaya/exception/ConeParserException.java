package by.maslouskaya.exception;

@SuppressWarnings("serial")
public class ConeParserException extends Exception {
	public ConeParserException() {
	}
	
	public ConeParserException(String message, Throwable exception) {
		super(message, exception);
	}
	
	public ConeParserException(String message) {
		super(message);
	}
	
	public ConeParserException(Throwable exception) {
		super(exception);
	}
}
