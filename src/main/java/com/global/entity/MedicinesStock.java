package com.global.entity;

import javax.persistence.Entity;

@Entity
public class MedicinesStock {
	

	private int medicineId;
	private String medicineName;
	private String companyName;
	private  String genericName;
	private int quantity;
	private double price;
	private String isActive;
	
	

}
