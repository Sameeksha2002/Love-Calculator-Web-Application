package com.spring.ic.api;

import javax.validation.constraints.AssertTrue;

import org.hibernate.validator.constraints.NotBlank;

//POJO(Plain Old Java Object) File / DTO(Data Transfer object) File
public class UserPlayDTO {

	//THE NAME OF CLASS VARIABLES MUST BE SAME AS THE FORM INOUT FIELD NAMES

	
//	 @Size(min=1,message="required")  
	@NotBlank(message = "* This field should not be blank")
	private String userName ;
	@NotBlank(message = "* This field should not be blank")
	private String crushName;	
	
	@AssertTrue(message ="* This should be checked to use this app")
	private boolean termsAndConditions;
	
	private int result;
	//	
	//generate getters

	public int getResult() {
		return result;
	}
	
	public String getUserName() {
		return userName;
	}
	public String getCrushName() {
		return crushName;
	}
	
	public boolean isTermsAndConditions() {
		return termsAndConditions;
	}

	
	//generate setters
	public void setResult(int result) {
		this.result = result;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	public void setTermsAndConditions(boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}
	
	//generate toString() method
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}
	
	

	
	
	
	


	
	
	
	
	
}
