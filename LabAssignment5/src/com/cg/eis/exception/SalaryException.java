package com.cg.eis.exception;

public class SalaryException extends Exception {
	private static final long serialVersionUID = 1L;

	public SalaryException() { 
		super("Your salary below than 3000 "); 
	}

}
