package proy;

public class ExceptionBR extends Exception {

	public ExceptionBR() {
		super();
	}

	public ExceptionBR(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ExceptionBR(String message, Throwable cause) {
		super(message, cause);
	}

	public ExceptionBR(String message) {
		super(message);
	}

	public ExceptionBR(Throwable cause) {
		super(cause);
	}
	
}
