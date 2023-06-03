package com.global.entity;

import javax.persistence.Entity;

//This is a Parent table for the tests in the hospital

@Entity
public class tests {
	
	private int testId;
	private String testName;
	private int testPrice;
	private String isActive;

}
