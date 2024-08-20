package com.cts.processPension.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Model class for pensioner details
 * 
 * @author Abby
 *
 */
@Getter
@AllArgsConstructor
public class PensionerDetail {
	private String name;
	private Date dateOfBirth;
	private String pan;
	private double salary;
	private double allowance;
	private String pensionType;
	private Bank bank;
	


	public String getName() {
		return name;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public String getPan() {
		return pan;
	}


	public double getSalary() {
		return salary;
	}


	public double getAllowance() {
		return allowance;
	}


	public String getPensionType() {
		return pensionType;
	}


	public Bank getBank() {
		return bank;
	}
	
	
}