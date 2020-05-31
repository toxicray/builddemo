package com.tryautobuild.demo.commen.exception;

/**
 * Package:com.tryautobuild.demo.commen.exception
 * *Author:ray
 * *version:...
 * *Created in 2020/5/31  21:57
 **/
//参数异常
public class ValidateException extends IllegalArgumentException {

	public ValidateException() {
		super();
	}

	public ValidateException(String s) {
		super(s);
	}
}
