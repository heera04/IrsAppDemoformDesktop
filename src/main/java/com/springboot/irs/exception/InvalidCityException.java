package com.springboot.irs.exception;

public class InvalidCityException extends IrsAppException {
	private static final long serialVersionUID = 1L;
	
	public InvalidCityException(String message) {
		super(message);
	}

}
