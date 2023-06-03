package com.global.entity;

import java.time.LocalDate;

public class Staff {
	
	private int id;
	private String staffid;
	private String staffname;
	//relation to usertable(userid foreign key.)
	private String userId;
	private LocalDate dateofbirth;
	private String gender;
	private String bloodgroup;
	private String phoneno;
	private String address;
	private String adharNo;
	private String qualification;
	private String email;
	private String IsActive;
	
	/*/*/
	
	
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStaffid() {
		return staffid;
	}


	public void setStaffid(String staffid) {
		this.staffid = staffid;
	}


	public String getStaffname() {
		return staffname;
	}


	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public LocalDate getDateofbirth() {
		return dateofbirth;
	}


	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getBloodgroup() {
		return bloodgroup;
	}


	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}


	public String getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getAdharNo() {
		return adharNo;
	}


	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getIsActive() {
		return IsActive;
	}


	public void setIsActive(String isActive) {
		IsActive = isActive;
	}
	
	

}
