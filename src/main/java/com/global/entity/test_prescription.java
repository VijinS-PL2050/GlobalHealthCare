package com.global.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;

//Here appointmentid is a foreign key to appointment table
//test id is foreignkey to tests table.

@Entity
public class test_prescription {
	
	private int testPrescriptionId;
	private int testId;
	private int appointmentId;
	private LocalDate testDay;
	

}
