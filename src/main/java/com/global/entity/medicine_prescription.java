package com.global.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;

//HERE medicine id is foreign key to medicine table.....shalini undakeela
//dosage id is foreignkey to dosagetable...
//Here diagnosisId is a foreign key to diagnosis table


@Entity
public class medicine_prescription {
	
	private int medicinePrescriptionId;
	
	private int medicineId;
	private int dosageId;
	private int noOfDay;
	private int diagnosisId;
	private LocalDate medicinePrescriptionDate;

}
