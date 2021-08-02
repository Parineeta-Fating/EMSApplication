package com.lti.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ICICIBank")
//@DiscriminatorValue("ICICI")
public class ICICI extends Bank
{
	private String lombardInsurance;
	

	public ICICI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ICICI(int bankid, String bankName, String location) {
		super(bankid, bankName, location);
		// TODO Auto-generated constructor stub
	}

	public String getLombardInsurance() {
		return lombardInsurance;
	}

	public void setLombardInsurance(String lombardInsurance) {
		this.lombardInsurance = lombardInsurance;
	}
}
