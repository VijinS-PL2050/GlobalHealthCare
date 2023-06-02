package com.global.entity;

import javax.persistence.Entity;

@Entity
public class DoctorDepartment {
	
	private int departmentId;
	private String departmentName;
	private boolean isActive;
	
	


	//default constructor
	public DoctorDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//parameterized constructor
	


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		
		return String.format("%-20s%-20s%n",this.departmentId,this.departmentName);
	}

}
