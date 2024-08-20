package com.cts.pensionerDetails.Model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *         This is the Model package PensionerDetails class
 *         which consist of pensioner details like Name, Date of Birth, PAN,
 *         Salary, Allowance Pension Type, Bank Details.
 *
 *         In lombok is used to generate setters, getters and all arguments
 *         constructors
 *  
 *  @author Abby
 */
@Getter
@AllArgsConstructor
public class PensionerDetails {

	private String name;
	@JsonFormat(shape = JsonFormat.Shape.STRING ,pattern = "YYYY-MM-dd" , timezone="IST")
	private Date dateOfBirth;
	private String pan;
	private double salary;
	private double allowance;
	private String pensionType;
	private BankDetails bank;
	
	
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
	public BankDetails getBank() {
		return bank;
	}

}
