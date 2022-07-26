package com.springboot.irs.exception;

public class InvalidNameException extends IrsAppException {
	private static final long serialVersionUID = 1L;
	
	public InvalidNameException(String message) {
		super(message);
	}

}