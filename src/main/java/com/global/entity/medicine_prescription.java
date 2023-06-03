package com.global.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;

//HERE medicine id is foreign key to medicine table.....shalini undakeela
//dosage id is foreignkey to dosagetable...
//Here appointmentid is a foreign key to appointment table


@Entity
public class medicine_prescription {
	
	private int medicinePrescriptionId;
	
	private int medicineId;
	private int dosageId;
	private int noOfDay;
	private int appoinmentId;
	private LocalDate medicinePrescriptionDate;

}
