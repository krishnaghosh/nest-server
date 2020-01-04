/**
 * 
 */
package com.srans.nestserver.model;

import java.io.Serializable;

/**
 * @author Ram
 *
 */
public class UaaUser implements Serializable { 
	 
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private String role; 
	
	
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UaaUser [username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append(", role=");
		builder.append(role);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
