package com.sebone.factoryonboardingdumy.exception;

/*
 * @ClassName     :    ApiException  
 * @UseMethods    :    extends RuntimeException
 * @ClassSpecifier:    public
 * @Objective     :    Throw  runtime exception.Runtime exceptions are thrown at runtime and hence difficult to be detected during compile time. They are difficult to handle,
 * 				      and the throws clause can only be used to define them but not catch them. This is a guide to Java RuntimeException.
 */

public class APIException extends RuntimeException {
	private static final long serialVersionUID = -2156421884729420813L;

	public APIException(String message) {
		super(message);
		
		
	}

}
