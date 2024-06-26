package com.dev.space.entity;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_data")
public class User {
	
	@Id
	@Column(name = "user_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	long uid;
	
	@Column(name = "name", nullable = false)
	String fullname;
	
	@Column(name = "email", nullable = false)
	String email;
	
	@Column(name = "phone_no", nullable = false)
	long phoneNo;
	
	@Column(name = "dob")
	Date dob;
	
	@Column(name = "place")
	String place;

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
