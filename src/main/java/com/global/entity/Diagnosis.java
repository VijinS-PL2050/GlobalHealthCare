package com.global.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;

//here appointmant id is foreignkey

@Entity
public class Diagnosis {
	
	private int diagnosisId;
	private String diagnosis;
	private String notes;
	private int appointmentId;
	private LocalDate diagnosisDate;

}
