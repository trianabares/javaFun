package com.triana.authentication.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LogReg {

	@NotBlank
	@Email
    private String email;
	
	@NotBlank
	@Size(min=8, max=64)
    private String password;
	
	public LogReg() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    	
}
