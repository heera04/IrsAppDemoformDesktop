package com.springboot.irs.exception;

public class InvalidEmailException extends IrsAppException {
	private static final long serialVersionUID = 1L;
	
	public InvalidEmailException(String message) {
		super(message);
	}

}


