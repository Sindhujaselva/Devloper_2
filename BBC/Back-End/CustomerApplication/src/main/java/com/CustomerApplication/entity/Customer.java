package com.CustomerApplication.entity;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="customerdetails")

public class Customer {
	
	@Id
	private int customerid;
	private String name;
	private double unitconsumption;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
	private Date billduedate;
	private String email;
	private String telephone;
	
	
	
	
	
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitconsumption() {
		return unitconsumption;
	}
	public void setUnitconsumption(double unitconsumption) {
		this.unitconsumption = unitconsumption;
	}
	public Date getBillduedate() {
		return billduedate;
	}
	public void setBillduedate(Date billduedate) {
		this.billduedate = billduedate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", name=" + name + ", unitconsumption=" + unitconsumption
				+ ", billduedate=" + billduedate + ", email=" + email + ", telephone=" + telephone + "]";
	}
	
	
	
	
	

}
