package com.CustomerApplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerLogin {
	@Id
	private int id;
	private int otp;
	
	
	public CustomerLogin() {
		super();
	}
	public CustomerLogin(int id, int otp) {
		this.id = id;
		this.otp = otp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	@Override
	public String toString() {
		return "CustomerLogin [id=" + id + ", otp=" + otp + "]";
	}
	

}
