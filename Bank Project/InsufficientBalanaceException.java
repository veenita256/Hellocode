package com.icici;

public class InsufficientBalanaceException extends RuntimeException {

	private String message;

	public InsufficientBalanaceException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage(){
		return message;
	}
}
