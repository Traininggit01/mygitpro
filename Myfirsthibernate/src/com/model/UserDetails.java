package com.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myuser")
public class UserDetails {
@Id 

	private integer userid;

private String username;
	public integer getUserid() {
		return userid;
	}
	public void setUserid(integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
