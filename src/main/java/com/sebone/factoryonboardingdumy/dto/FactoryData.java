package com.sebone.factoryonboardingdumy.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
/**
* The FactoryData class  implements an  that
* simply providing values to the attributes  to the standard output.
*
* @author  Mohit
* @version 
*  
*/

/*
 * @ClassName     :    FactoryData(Entity class)
 * @UseMethods    :    getters and setters 
 * @ClassSpecifier:    public
 * @Objective     :    Crate class for getters and setters.
 */
public class FactoryData {
	@Id
	private long id;
	private int categoryId;
	private String name;
	private String city;
	private String gstNumber;
	private String registrationNumber;
	private String ownerName;
	private String gmail;
	private String contactNumber;
	private String state;
	private String address;
	private String establistDate;
	private String factoryStatus;
	private String lastModifiedDate;
	private String creationDate;
	private int isEnabled;
	private List<Compliance>compliances;
	
	/**
	 * @return the compliances
	 */
	public List<Compliance> getCompliances() {
		return compliances;
	}


	/**
	 * @param compliances the compliances to set
	 */
	public void setCompliances(List<Compliance> compliances) {
		this.compliances = compliances;
	}


	public FactoryData() {
	    this.compliances = new ArrayList<>();
	}

	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}



	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}



	/**
	 * @return the gstNumber
	 */
	public String getGstNumber() {
		return gstNumber;
	}



	/**
	 * @return the registrationNumber
	 */
	public String getRegistrationNumber() {
		return registrationNumber;
	}



	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}



	/**
	 * @return the gmail
	 */
	public String getGmail() {
		return gmail;
	}



	
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}



	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}



	/**
	 * @return the establistDate
	 */
	public String getEstablistDate() {
		return establistDate;
	}



	/**
	 * @return the factoryStatus
	 */
	public String getFactoryStatus() {
		return factoryStatus;
	}



	/**
	 * @return the lastModifiedDate
	 */
	public String getLastModifiedDate() {
		return lastModifiedDate;
	}



	/**
	 * @return the creationDate
	 */
	public String getCreationDate() {
		return creationDate;
	}



	/**
	 * @return the isEnabled
	 */
	public int getIsEnabled() {
		return isEnabled;
	}



	/**
	 * @param id
	 * @param categoryId
	 * @param name
	 * @param city
	 * @param gstNumber
	 * @param string
	 * @param ownerName
	 * @param gmail
	 * @param contactNumber
	 * @param state
	 * @param address
	 * @param establistDate
	 * @param factoryStatus
	 * @param lastModifiedDate
	 * @param creationDate
	 * @param isEnabled
	 * create a constructor a constructor 
	 */
	public FactoryData(long id, int categoryId, String name, String city, String gstNumber, String string,
			String ownerName, String gmail, String contactNumber, String state, String address, String establistDate,
			String factoryStatus, String lastModifiedDate, String creationDate, int isEnabled,List<Compliance>compliances) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.city = city;
		this.gstNumber = gstNumber;
		this.registrationNumber = string;
		this.ownerName = ownerName;
		this.gmail = gmail;
		this.contactNumber = contactNumber;
		this.state = state;
		this.address = address;
		this.establistDate = establistDate;
		this.factoryStatus = factoryStatus;
		this.lastModifiedDate = lastModifiedDate;
		this.creationDate = creationDate;
		this.isEnabled = isEnabled;
		this.compliances=compliances;
	}


	public FactoryData orElseThrow(Object object) {
		// TODO Auto-generated method stub
		return null;
	}


	





	
}
