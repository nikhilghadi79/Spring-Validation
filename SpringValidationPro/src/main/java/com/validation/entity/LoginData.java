package com.validation.entity;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {
	
	@NotBlank(message = "userName can not be empty")
	@Size(min = 4,max = 12,message = "Must be between 4-12 characters")
	private String userName;
	
	@Pattern(regexp = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$",message = "Invalid Email")
	private String userEmail;
	
	@AssertTrue(message = "Please read T&C carefully")
	private boolean agreed;
	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginData(String userName, String userEmail) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", userEmail=" + userEmail + "]";
	}
	

}
