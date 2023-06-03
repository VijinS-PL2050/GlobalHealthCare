package com.global.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;

//Here diagnosisId is a foreign key to diagnosis table
//test id is foreignkey to tests table.

@Entity
public class test_prescription {
	
	private int testPrescriptionId;
	private int testId;
	private int diagnosisId;
	private LocalDate testDay;
	

}
