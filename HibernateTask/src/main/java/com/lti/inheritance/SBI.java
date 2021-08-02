package com.lti.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="SBIBank")
//@DiscriminatorValue("SBI")
public class SBI extends Bank
{
	private String carLoanInt;
	
	

	public SBI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SBI(int bankid, String bankName, String location) {
		super(bankid, bankName, location);
		// TODO Auto-generated constructor stub
	}

	public String getCarLoanInt() {
		return carLoanInt;
	}

	public void setCarLoanInt(String carLoanInt) {
		this.carLoanInt = carLoanInt;
	}
	
	

	
}
