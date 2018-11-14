package com.extrato.beans;

public class RetornaErroInternalException extends RuntimeException {

	/**
	 *  Exceção interna (500)
	 */
	private static final long serialVersionUID = 1L;

	public RetornaErroInternalException(String exception) {
		    super(exception);
		  }
}
