package com.lti.inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Bank")
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name="FROMBANK", discriminatorType=DiscriminatorType.STRING)
public class Bank 
{
	@Id
	private int bankid;
	private String bankName;
	private String location;
	
	
	public Bank() {
		super();
		
	}
	
	public Bank(int bankid, String bankName, String location) {
		super();
		this.bankid = bankid;
		this.bankName = bankName;
		this.location = location;
	}

	public int getBankid() {
		return bankid;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
