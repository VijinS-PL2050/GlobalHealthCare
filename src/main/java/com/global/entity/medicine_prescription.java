package com.global.entity;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class medicine_prescription {
	
	private int medicinePrescriptionId;
	private int medicineId;
	private int dosageId;
	private int daysId;
	private int appoinmentId;
	private Date appointmentDate;

}
