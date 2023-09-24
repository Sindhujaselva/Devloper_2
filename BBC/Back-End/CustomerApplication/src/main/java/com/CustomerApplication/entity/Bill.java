package com.CustomerApplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="billinfo")
public class Bill {
	
	@Id
	private int billid;
	private String status;
	private int customerid;
	private int billamount;
	
	public int getBillamount() {
		return billamount;
	}
	public void setBillamount(int billamount) {
		this.billamount = billamount;
	}
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	@Override
	public String toString() {
		return "Bill [billamount=" + billamount + ", billid=" + billid + ", status=" + status + ", customerid="
				+ customerid + "]";
	}
	
	

}
