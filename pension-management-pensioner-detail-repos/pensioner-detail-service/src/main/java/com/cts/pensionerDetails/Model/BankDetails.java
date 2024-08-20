package com.cts.pensionerDetails.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 
 * This is BankDetail class which contains the Bank details
 * like bankName, bankType, accountNumber
 * 
 * @author Abby
 *
 */

@AllArgsConstructor
@Getter
public class BankDetails {
	
	private String bankName;
	private long accountNumber;
	private String bankType;
	

	public String getBankName() {
		return bankName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getBankType() {
		return bankType;
	}
	
	
}
