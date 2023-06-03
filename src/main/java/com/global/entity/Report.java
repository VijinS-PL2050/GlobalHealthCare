package com.global.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

//appointmentid is foreignkey
@Entity
public class Report {
	private int reportId;
	private String Report;
	private LocalDate reportDate;
	private int appointmentId;
	
	

}
