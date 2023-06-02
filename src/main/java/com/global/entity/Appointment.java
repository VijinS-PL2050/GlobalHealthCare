package com.global.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;


@Entity
public class Appointment {

	
	// Object creation for interface by subclass
	

	// instance variable
	private int bookingNo;
	private String mrNo;
	private int departmentId;
	private String departmentName;
	private String doctorId;
	private String doctorName;
	private int consultationFee;
	private LocalDateTime appointmentDateTime;
	private LocalDateTime appointmentValidity;
	private int appointmentBillNo;
	private boolean isActive;
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBookingNo() {
		return bookingNo;
	}

	public void setBookingNo(int bookingNo) {
		this.bookingNo = bookingNo;
	}

	public String getMrNo() {
		return mrNo;
	}

	public void setMrNo(String mrNo) {
		this.mrNo = mrNo;
	}

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
		return "Appointment [bookingNo=" + bookingNo + ", mrNo=" + mrNo + ", departmentId=" + departmentId
				+ ", departmentName=" + departmentName + ", doctorId=" + doctorId + ", doctorName=" + doctorName
				+ ", consultationFee=" + consultationFee + ", appointmentDateTime=" + appointmentDateTime
				+ ", appointmentValidity=" + appointmentValidity + ", appointmentBillNo=" + appointmentBillNo
				+ ", isActive=" + isActive + "]";
	}

	// default constructor
    
	

}
