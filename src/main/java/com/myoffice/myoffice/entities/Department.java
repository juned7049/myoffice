package com.myoffice.myoffice.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer depid;
	private String depaname;

	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Employee> employees = new ArrayList<>();

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Integer depid, String depaname) {
		super();
		this.depid = depid;
		this.depaname = depaname;
	}

	public Integer getDepid() {
		return depid;
	}

	public void setDepid(Integer depid) {
		this.depid = depid;
	}

	public String getDepaname() {
		return depaname;
	}

	public void setDepaname(String depaname) {
		this.depaname = depaname;
	}

}
