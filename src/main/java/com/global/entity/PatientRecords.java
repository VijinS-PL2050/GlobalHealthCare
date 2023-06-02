package com.global.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class PatientRecords {
	
	private String mrNo;
	private String patientName;
	private long patientPhone;
	private String patientAddress;
	private short patientAge;
	private String patientGender;
	private String patientBlood;
	private LocalDate registrationDate;
	private LocalDate validityDate;
	private boolean isActive;
	
	public PatientRecords() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMrNo() {
		return mrNo;
	}

	public void setMrNo(String mrNo) {
		this.mrNo = mrNo;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public long getPatientPhone() {
		return patientPhone;
	}

	public void setPatientPhone(long patientPhone) {
		this.patientPhone = patientPhone;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public short getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(short patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientBlood() {
		return patientBlood;
	}

	public void setPatientBlood(String patientBlood) {
		this.patientBlood = patientBlood;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public LocalDate getValidityDate() {
		return validityDate;
	}

	public void setValidityDate(LocalDate validityDate) {
		this.validityDate = validityDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "PatientRecords [mrNo=" + mrNo + ", patientName=" + patientName + ", patientPhone=" + patientPhone
				+ ", patientAddress=" + patientAddress + ", patientAge=" + patientAge + ", patientGender="
				+ patientGender + ", patientBlood=" + patientBlood + ", registrationDate=" + registrationDate
				+ ", validityDate=" + validityDate + ", isActive=" + isActive + "]";
	}
	
	
	

}
