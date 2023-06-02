package com.global.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;

@Entity
public class AppointmentDepartDoctor {

	// instance variable
	private int tokenNo;
	private String mrNo;
	private String departmentName;
	private String doctorName;
	private int consultationFee;
	private LocalDateTime appointmentDateTime;
	private LocalDateTime appointmentValidity;
	private int appointmentBillNo;
	private boolean isActive;

	//default constructor
	public AppointmentDepartDoctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	// parameterised constructor
	
	// getter and setters
	public int getTokenNo() {
		return tokenNo;
	}

	public void setTokenNo(int tokenNo) {
		this.tokenNo = tokenNo;
	}

	public String getMrNo() {
		return mrNo;
	}

	public void setMrNo(String mrNo) {
		this.mrNo = mrNo;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public int getConsultationFee() {
		return consultationFee;
	}

	public void setConsultationFee(int consultationFee) {
		this.consultationFee = consultationFee;
	}

	public LocalDateTime getAppointmentDateTime() {
		return appointmentDateTime;
	}

	public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}

	public LocalDateTime getAppointmentValidity() {
		return appointmentValidity;
	}

	public void setAppointmentValidity(LocalDateTime appointmentValidity) {
		this.appointmentValidity = appointmentValidity;
	}

	public int getAppointmentBillNo() {
		return appointmentBillNo;
	}

	public void setAppointmentBillNo(int appointmentBillNo) {
		this.appointmentBillNo = appointmentBillNo;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	@Override
	public String toString() {
		
		return String.format("%-15s%-12s%-15s%-15s%-15s%-20s%-20s%-18s%-12s%n",this.tokenNo,this.mrNo,
				this.departmentName,this.doctorName,this.consultationFee,this.appointmentDateTime,this.appointmentValidity,
				this.appointmentBillNo,this.isActive);
	}
}
