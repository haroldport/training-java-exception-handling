package com.arquitecturajava.ejemplo005;

public class ServicioException extends Exception {

	private static final long serialVersionUID = 1L;

	public ServicioException() {
		super();
	}

	public ServicioException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ServicioException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServicioException(String message) {
		super(message);
	}

	public ServicioException(Throwable cause) {
		super(cause);
	}
	
	

}
