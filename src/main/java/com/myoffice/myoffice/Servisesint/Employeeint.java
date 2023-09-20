package com.myoffice.myoffice.Servisesint;

import java.util.List;

import com.myoffice.myoffice.Dto.EmployeeDto;

public interface Employeeint {

	// add
	public EmployeeDto addemp(EmployeeDto employeedto, Integer depid, Integer officeid);
	// getbyname

	public EmployeeDto getbyname(String empname);

	// getbydepartment

	public List<EmployeeDto> getbydepartment(String depaname);

	// getbycountry

	public List<EmployeeDto> getbycountry(String country);
}
