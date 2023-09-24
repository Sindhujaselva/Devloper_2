package com.CustomerApplication.customerdto;

public class CustomerDTO {
	private int id;
	private int otp;
	public CustomerDTO(int id, int otp) {
		super();
		this.id = id;
		this.otp = otp;
	}
	public CustomerDTO() {
		super();
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
		return "CustomerDTO [id=" + id + ", otp=" + otp + "]";
	}
	

}
