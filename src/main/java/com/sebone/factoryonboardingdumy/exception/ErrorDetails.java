package com.sebone.factoryonboardingdumy.exception;

import java.util.Date;

/*
 * @ClassName     :    ErrorDetails  
 * @UseMethods    :    Cunstroctor and getters ,setter
 * @ClassSpecifier:    public
 * @Objective     :    This is Enttiy class of ErrorMessage
 */
public class ErrorDetails {

	
	private Date timestamp;
	private String message;
	private String Details;
	/**
	 * @param timestamp
	 * @param message
	 * @param details
	 */
	
	public ErrorDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.Details = details;
	}
	/**
	 * 
	 */
	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the details
	 */
	public String getDetails() {
		return Details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		Details = details;
	}
	
	
}
