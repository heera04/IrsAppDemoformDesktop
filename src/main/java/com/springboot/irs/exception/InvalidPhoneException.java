package com.springboot.irs.exception;

public class InvalidPhoneException extends IrsAppException {
	private static final long serialVersionUID = 1L;
	
	public InvalidPhoneException(String message) {
		super(message);
	}

}
