package com.niftyexpress.login.dto;

//import com.niftyexpress.dto.UserDto;

public class LoginDto {
	private String emailId;
	private String password;
	
	public String getUserEmail() {
		return emailId;
	}
	public void setUserEmail(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginDto other = (LoginDto) obj;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return false;
	}
	
	@Override
	public String toString() {
		return "LoginDto [UserEmail=" + emailId + ", Password=" + password + "]";
	}
	
		
}
