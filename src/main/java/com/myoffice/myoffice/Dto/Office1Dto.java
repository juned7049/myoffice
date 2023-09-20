package com.myoffice.myoffice.Dto;

public class Office1Dto {

	private int officeid;
	private String address;
	private String country;

	public Office1Dto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Office1Dto(int officeid, String address, String country) {
		super();
		this.officeid = officeid;
		this.address = address;
		this.country = country;
	}

	public int getOfficeid() {
		return officeid;
	}

	public void setOfficeid(int officeid) {
		this.officeid = officeid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
