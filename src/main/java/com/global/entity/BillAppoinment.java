package com.global.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;

@Entity
public class BillAppoinment {
	
	
	private int appointmentBillNo;
	private LocalDateTime billDate;
	private Double billAmount;
	private boolean isActive;
	
	public BillAppoinment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getAppointmentBillNo() {
		return appointmentBillNo;
	}
	public void setAppointmentBillNo(int appointmentBillNo) {
		this.appointmentBillNo = appointmentBillNo;
	}
	public LocalDateTime getBillDate() {
		return billDate;
	}
	public void setBillDate(LocalDateTime billDate) {
		this.billDate = billDate;
	}
	public Double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		
		return String.format("%-25s%-26s%-20s%-20s%n",this.appointmentBillNo,this.billDate,
				this.billAmount,this.isActive);
	}
	
	

}
