package com.global.entity;

import javax.persistence.Entity;

@Entity
public class Doctor {
	

	//instance variable
	private String doctorId;
	private String doctorName;
	private double consultationFee;
	private int departmentId;
	private boolean isActive;
	
	
	


	//default constructor
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//parameterized constructor
	


	public String getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public double getConsultationFee() {
		return consultationFee;
	}


	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String toString() {		
		
		return String.format("%-25s%-25s%-20s%n",this.doctorId,this.doctorName,this.consultationFee);
	}
	
	

}
