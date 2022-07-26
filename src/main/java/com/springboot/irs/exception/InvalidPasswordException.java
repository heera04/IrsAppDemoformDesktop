package com.springboot.irs.exception;

public class InvalidPasswordException extends IrsAppException {
	private static final long serialVersionUID = 1L;
	
	public InvalidPasswordException(String message) {
		super(message);
	}

}