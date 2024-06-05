package com.apostassa.dominio;

public class ValidacaoException extends RuntimeException {

	public ValidacaoException(String message) {
        super(message);
    }

    public ValidacaoException(String message, Throwable cause) {
        super(message, cause);
    }
    
}

