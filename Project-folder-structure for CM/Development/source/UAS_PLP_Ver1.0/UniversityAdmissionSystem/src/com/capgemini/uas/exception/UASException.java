package com.capgemini.uas.exception;

public class UASException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	public UASException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
}
