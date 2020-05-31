package com.tryautobuild.demo.commen.exception;

/**
 * Package:com.tryautobuild.demo.commen.exception
 * *Author:ray
 * *version:...
 * *Created in 2020/5/31  22:03
 **/
public class BadRequestException extends RuntimeException {

	public BadRequestException() {
		super();
	}

	public BadRequestException(String message) {
		super(message);
	}
}
