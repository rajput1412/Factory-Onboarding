package com.sebone.factoryonboardingdumy.dto;

/*
 * @ClassName     :   Compliance(Entity class)
 * @UseMethods    :    getters and setters 
 * @ClassSpecifier:    public
 * @Objective     :    Crate class for getters and setters.
 */

public class Compliance {
	
	private String type;
	private long regularityId;
	private String Status;
	private String certificateNumber;
	private String dateOfExpiring;
	/**
	 * @param type
	 * @param regularityId
	 * @param status
	 * @param certificateNumber
	 * @param dateOfExpiring
	 */
	public Compliance( String type ,long regularityId, String certificateNumber, String dateOfExpiring,String status) {
		super();
		this.regularityId = regularityId;
		Status = status;
		this.certificateNumber = certificateNumber;
		this.dateOfExpiring = dateOfExpiring;
		this.type=type;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @return the regularityId
	 */
	public long getRegularityId() {
		return regularityId;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return Status;
	}
	/**
	 * @return the certificateNumber
	 */
	public String getCertificateNumber() {
		return certificateNumber;
	}
	/**
	 * @return the dateOfExpiring
	 */
	public String getDateOfExpiring() {
		return dateOfExpiring;
	}
	/**
	 * 
	 */
	public Compliance() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
