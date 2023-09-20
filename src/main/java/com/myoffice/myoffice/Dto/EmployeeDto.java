package com.myoffice.myoffice.Dto;

public class EmployeeDto {

	private int empid;
	private String empname;

	private DepartmentDto department;

	private Office1Dto office1;

	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDto(int empid, String empname, DepartmentDto department, Office1Dto office1) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.department = department;
		this.office1 = office1;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public DepartmentDto getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}

	public Office1Dto getOffice1() {
		return office1;
	}

	public void setOffice1(Office1Dto office1) {
		this.office1 = office1;
	}

}
