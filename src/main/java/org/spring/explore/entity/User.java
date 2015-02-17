package org.spring.explore.entity;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -6548109004863081634L;
	private long userId;
	private String userName;
	private String mobileTel;
	private String address;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileTel() {
		return mobileTel;
	}

	public void setMobileTel(String mobileTel) {
		this.mobileTel = mobileTel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
