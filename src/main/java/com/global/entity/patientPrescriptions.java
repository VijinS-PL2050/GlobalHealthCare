package com.global.entity;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class patientPrescriptions {
	
	private int prescriptionId;
	private String diagnosis;
	private String notes;
	private int appointmentId;
	private Date prescriptionDate;

}
