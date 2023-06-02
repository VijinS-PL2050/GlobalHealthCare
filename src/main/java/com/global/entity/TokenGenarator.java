package com.global.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;

@Entity
public class TokenGenarator {

	
	//instance variable
	private String tokenNo;
	private int bookingNo;
	private String mrNo;
	private LocalDateTime tokenTime;
	private String doctorId;
	private boolean isActive;
	
	//default constructor
	public TokenGenarator() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	//parameratised constructor
	
	public TokenGenarator(int bookingNo, String mrNo, LocalDateTime tokenTime, String doctorId) {
		super();
		this.bookingNo = bookingNo;
		this.mrNo = mrNo;
		this.tokenTime = tokenTime;
		this.doctorId = doctorId;
	}



	public TokenGenarator(String tokenNo, int bookingNo, String mrNo, LocalDateTime tokenTime, String doctorId,
			boolean isActive) {
		super();
		this.tokenNo = tokenNo;
		this.bookingNo = bookingNo;
		this.mrNo = mrNo;
		this.tokenTime = tokenTime;
		this.doctorId = doctorId;
		this.isActive = isActive;
	}



	public String getTokenNo() {
		return tokenNo;
	}



	public void setTokenNo(String tokenNo) {
		this.tokenNo = tokenNo;
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



	public LocalDateTime getTokenTime() {
		return tokenTime;
	}



	public void setTokenTime(LocalDateTime tokenTime) {
		this.tokenTime = tokenTime;
	}



	public String getDoctorId() {
		return doctorId;
	}



	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}



	public boolean isActive() {
		return isActive;
	}



	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}



	@Override
	public String toString() {		
		return String.format("%-15s%-15s%-20s%-20s%-15s%-15s%n", this.tokenNo, this.bookingNo,
				this.mrNo, this.tokenTime, this.doctorId,  this.isActive);
	}
	
	
}
