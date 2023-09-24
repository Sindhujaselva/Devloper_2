package com.CustomerApplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
	@Id
	private String customername;
	private int cardnumber;
	private int cvv;
	private int finalamount;
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	private  String paymentstatus;
	
	public int getFinalamount() {
		return finalamount;
	}
	public void setFinalamount(int finalamount) {
		this.finalamount = finalamount;
	}
	public int getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	@Override
	public String toString() {
		return "Payment [customername=" + customername + ", cardnumber=" + cardnumber + ", cvv=" + cvv
				+ ", finalamount=" + finalamount + ", paymentstatus=" + paymentstatus + "]";
	}
	
	
	
	

}
