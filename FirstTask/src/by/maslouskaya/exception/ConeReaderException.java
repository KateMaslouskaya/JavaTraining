package by.maslouskaya.exception;

@SuppressWarnings("serial")
public class ConeReaderException extends Exception {
	public ConeReaderException() {
	}
	
	public ConeReaderException(String message, Throwable exception) {
		super(message, exception);
	}
	
	public ConeReaderException(String message) {
		super(message);
	}
	
	public ConeReaderException(Throwable exception) {
		super(exception);
	}
}
