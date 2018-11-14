package com.extrato.beans;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RetornaErroNotFoundException extends RuntimeException{

	/**
	 *  Exceção Not Found (400)
	 */
	private static final long serialVersionUID = 1L;

	public RetornaErroNotFoundException(String exception) {
	    super(exception);
	  }
}
