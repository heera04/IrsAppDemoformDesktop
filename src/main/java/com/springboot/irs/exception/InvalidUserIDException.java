package com.springboot.irs.exception;

public class InvalidUserIDException extends IrsAppException {
	private static final long serialVersionUID = 1L;
	
	public InvalidUserIDException(String message) {
		super(message);
	}

}

