package com.myoffice.myoffice.Servisesint;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myoffice.myoffice.Dto.EmployeeDto;
import com.myoffice.myoffice.Repository.DepartmentRepo;
import com.myoffice.myoffice.Repository.EmployeeRepo;
import com.myoffice.myoffice.Repository.OfficeRepo;
import com.myoffice.myoffice.entities.Department;
import com.myoffice.myoffice.entities.Employee;
import com.myoffice.myoffice.entities.Office1;
import com.myoffice.myoffice.exception.ResourceNotFoundException;

@Service
public class Employeeimp implements Employeeint {

	@Autowired
	private EmployeeRepo emprepo;

	@Autowired
	private DepartmentRepo departrepo;

	@Autowired
	private OfficeRepo offrepo;

	@Autowired
	private ModelMapper modelmapper;

	// CONVERTING EMPLOYE TO EMPLOYE DTO AND EMPLOYE DTO TO EMPLOYE BY THE HELP OF
	// MOELMAPPER.

	public Employee dtotoemploye(EmployeeDto employeedto) {
		Employee employee = this.modelmapper.map(employeedto, Employee.class);
		return employee;
	}

	public EmployeeDto employeetodto(Employee employee) {

		EmployeeDto employeedto = this.modelmapper.map(employee, EmployeeDto.class);
		return employeedto;
	}

	// ADD EMPLOYEE
	@Override
	public EmployeeDto addemp(EmployeeDto employeedto, Integer depid, Integer officeid) {
		// TODO Auto-generated method stub
		Department depart = this.departrepo.findById(depid)
				.orElseThrow(() -> new ResourceNotFoundException("department", "id", depid));
		System.out.println("from database" + depart);
		Office1 offi = this.offrepo.findById(officeid)
				.orElseThrow(() -> new ResourceNotFoundException("office", "id", officeid));

		Employee employee1 = this.dtotoemploye(employeedto);

		employee1.setDepartment(depart);

		employee1.setOffice1(offi);

		Employee saveemp = this.emprepo.save(employee1);
		System.out.println("save " + saveemp);
		return this.employeetodto(saveemp);
	}

	@Override
	public EmployeeDto getbyname(String empname) {
		// TODO Auto-generated method stub
		Employee employeename = this.emprepo.findByEmpname(empname);

		return this.employeetodto(employeename);
	}

	// GET BY DEPARTMENT NANE
	@Override
	public List<EmployeeDto> getbydepartment(String depaname) {
		// TODO Auto-generated method stub
		Department department1 = this.departrepo.findByDepaname(depaname);
		System.out.println("find " + department1);
		List<Employee> empl = this.emprepo.findByDepartment(department1);
		System.out.println("empl repo" + empl);
		List<EmployeeDto> empldto = empl.stream().map(empl10 -> this.employeetodto(empl10))
				.collect(Collectors.toList());
		System.out.println("last final" + empldto);

		return empldto;
	}

	// GET BY COUNTRY NAME

	@Override
	public List<EmployeeDto> getbycountry(String country) {
		// TODO Auto-generated method stub
		Office1 office1 = this.offrepo.findByCountry(country);
		System.out.println("find " + office1);
		List<Employee> off1 = this.emprepo.findByOffice1(office1);
		System.out.println("office repo" + off1);
		List<EmployeeDto> offidto = off1.stream().map(offl10 -> this.employeetodto(offl10))
				.collect(Collectors.toList());
		System.out.println("last final" + offidto);

		return offidto;

	}

}
