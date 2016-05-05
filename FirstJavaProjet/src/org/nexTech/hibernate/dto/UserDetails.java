package org.nexTech.hibernate.dto;

import javax.persistence.Entity;

@Entity
public class UserDetails {
	private int userId;
	private String userName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName1(String userName) {
		this.userName = userName;
	}
	public void setUserName(String userName2) {
		// TODO Auto-generated method stub
		
	}

}
