package com.global.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

//diagnosisId is foreignkey to diagnosis table
@Entity
public class Report {
	private int reportId;
	private String Report;
	private LocalDate reportDate;
	private int diagnosisId;
	private String highValue;
	private String lowValue;
	private String actualValue;
	private String unit;
	
	

}
