package com.apostassa.dominio.usuario.validation;

public class RegrasComumDeValidacao {
	
	public static final String MESSAGE_PASSWORD_NOTBLANK = "A senha não pode ser nula ou conter espaços";
	
	public static final String MESSAGE_MIN_PASSWORD_LENGTH = "A senha deve conter no minimo " + RegrasComumDeValidacao.MIN_PASSWORD_LENGTH + " digitos";
	
	public static final String MESSAGE_DATANASCIMENTO_NOTNULL = "A data de nascimento não pode ser nula";

	public static final String MESSAGE_NOME_NOTBLANK = "O nome não pode ser nulo";

	public static final String MESSAGE_EMAIL_NOTBLANK = "O email não pode ser nulo";

	public static final String MESSAGE_CPF_NOTBLANK = "O cpf não pode ser nulo";

	public static final int MIN_PASSWORD_LENGTH = 10;

	public static final int IDADE_MINIMA = 18;
}
