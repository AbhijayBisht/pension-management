package com.cts.authorization.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Model class for user request sent for logging in
 * 
 * @author Abby
 *
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class UserRequest {

	@NotBlank(message = "Username cannot be empty")
	@Size(min=4, max=25, message = "Username length should be from 4 to 25 characters")
	private String username;
	
	@NotBlank(message = "Password cannot be empty")
	private String password;
	
	
	@Override
	public String toString() {
		return "UserRequest [username=" + username + ", password=" + password + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
