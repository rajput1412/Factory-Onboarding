package com.sebone.factoryonboardingdumy.exception;

import java.util.Date;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
/*
 * @ClassName     :    GlobalExceptionHandler  
 * @UseMethods    :    Controlle all exception
 * @ClassSpecifier:    public
 * @Objective     :    The Global Exception Handler is a type of workflow designed to determine the project’s behavior 
 *                   when encountering an execution error. Only one Global Exception Handler can be set per automation project.
*/
/*
 * ControllerAdvice to handle three exceptions: when a city is not found, when there is no data, 
 * and when a data for a new city to be saved is not valid. 
 * This is the project structure. This is the Maven build file.
 * */
@ControllerAdvice
public class GlobalExceptionHandler {
	/*  @Method Name  :     handleResourceNotFoundException 
	 *  @ArgumentType :     ResourceNotFoundException WebRequest
	 *  @ReturnType   :	    ResponseEntity<?>  
	 *  @Objective    :     throw resource not found excetpion 
	 */
	
	/* 
	 *ExceptionHandler – Multiple exceptions and global handler Exception handling is very essential feature of any Java application. 
	 *Every good open source framework allows to write the exception handlers in such a way 
	 *that we can separate then from our application code. 
	 */
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?>handleResourceNotFoundException(ResourceNotFoundException exception,WebRequest request)
	{
		ErrorDetails error=new ErrorDetails(new Date(),exception.getMessage(),request.getDescription(false));
		return new  ResponseEntity(error,HttpStatus.NOT_FOUND) ;
		
	}
	/*  @Method Name  :     handleAPIException 
	 *  @ArgumentType :     ApiException ,WebRequest
	 *  @ReturnType   :	    ResponseEntity<?>  
	 *  @Objective    :     Crate Method for get all  factory Data. 
	 */
	@ExceptionHandler(APIException.class)
	public ResponseEntity<?>handleAPIException(APIException exception,WebRequest request)
	{
		ErrorDetails error=new ErrorDetails(new Date(),exception.getMessage(),request.getDescription(false));
		return new  ResponseEntity(error,HttpStatus.NOT_FOUND) ;
		
	}

	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?>handleException(Exception exception,WebRequest request)
	{
		ErrorDetails error=new ErrorDetails(new Date(),exception.getMessage(),request.getDescription(false));
		return new  ResponseEntity(error,HttpStatus.INTERNAL_SERVER_ERROR) ;
		
	}
}
