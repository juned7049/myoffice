package com.myoffice.myoffice.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empid;
	private String empname;

	@ManyToOne
	@JsonBackReference
	private Department department;

	@ManyToOne
	private Office1 office1;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empid, String empname, Department department, Office1 office1) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.department = department;
		this.office1 = office1;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Office1 getOffice1() {
		return office1;
	}

	public void setOffice1(Office1 office1) {
		this.office1 = office1;
	}

}
