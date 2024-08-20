package com.cts.disbursepension.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Model class for bank details
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
	
	
	@Override
	public String toString() {
		return "BankDetails [bankName=" + bankName + ", accountNumber=" + accountNumber + ", bankType=" + bankType
				+ "]";
	}
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
