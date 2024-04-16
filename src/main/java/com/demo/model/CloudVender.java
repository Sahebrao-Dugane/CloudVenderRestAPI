package com.demo.model;

public class CloudVender {
	
	private String venderId;
	private String venderName;
	private String venderAddress;
	private String phoneNumber;
	
	public CloudVender() {
		super();
	}

	public CloudVender(String venderId, String venderName, String venderAddress, String phoneNumber) {
		
		this.venderId = venderId;
		this.venderName = venderName;
		this.venderAddress = venderAddress;
		this.phoneNumber = phoneNumber;
	}

	public String getVenderId() {
		return venderId;
	}

	public void setVenderId(String venderId) {
		this.venderId = venderId;
	}

	public String getVenderName() {
		return venderName;
	}

	public void setVenderName(String venderName) {
		this.venderName = venderName;
	}

	public String getVenderAddress() {
		return venderAddress;
	}

	public void setVenderAddress(String venderAddress) {
		this.venderAddress = venderAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
