package com.spring.ic.api;

import javax.validation.constraints.AssertTrue;

import org.hibernate.validator.constraints.NotBlank;


//POJO(Plain Old Java Object) File / DTO(Data Transfer object) File
public class UserInfoDTO {

	//THE NAME OF CLASS VARIABLES MUST BE SAME AS THE FORM INOUT FIELD NAMES
	
//	 @Size(min=1,message="required")  
	@NotBlank(message = "* This field should not be blank")
	private String userName;	

	@NotBlank(message = "* This field should not be blank")
	private String password;
	private String countryName;
	private String userHobbies;
	private String userGender;
//	@NotBlank(message = "* Please provide contact details")
	private CommunicationDTO communicationDTO;

	//constructor 
//	public UserInfoDTO() {
//		System.out.println("user dto constr called");
//	}
//	
	//generate getters
	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	public String getCountryName() {
		return countryName;
	}
	public String getUserHobbies() {
		return userHobbies;
	}
	public String getUserGender() {
		return userGender;
	}
	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}
	
	//generate setters
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public void setUserHobbies(String userHobbies) {
		this.userHobbies = userHobbies;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}
	//generate toString() method
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", password="
				+ password + ", countryName=" + countryName + ", userHobbies=" + userHobbies + ", userGender="
				+ userGender + "]";
	}
	
	

	
	
	
	


	
	
	
	
	
}
