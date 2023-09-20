package com.myoffice.myoffice.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Office1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer officeid;
	private String address;
	private String country;

	@OneToMany(mappedBy = "office1", cascade = CascadeType.ALL)
	private List<Employee> employees = new ArrayList<>();

	public Office1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Office1(Integer officeid, String address, String country) {
		super();
		this.officeid = officeid;
		this.address = address;
		this.country = country;
	}

	public Integer getOfficeid() {
		return officeid;
	}

	public void setOfficeid(Integer officeid) {
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
