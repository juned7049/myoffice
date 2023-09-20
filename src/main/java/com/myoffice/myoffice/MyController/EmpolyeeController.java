package com.myoffice.myoffice.MyController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myoffice.myoffice.Dto.EmployeeDto;
import com.myoffice.myoffice.Servisesint.Employeeimp;

@RestController
public class EmpolyeeController {

	@Autowired
	private Employeeimp empservise;

	// ADD EMPLOYEE

	@PostMapping("/Department/{depaid}/office/{officeid}/employee")
	public ResponseEntity<EmployeeDto> addemp(@PathVariable Integer depaid, @PathVariable Integer officeid,
			@RequestBody EmployeeDto employeeDto) {

		EmployeeDto employ1 = this.empservise.addemp(employeeDto, depaid, officeid);
		System.out.println(employ1);
		return new ResponseEntity<EmployeeDto>(employ1, HttpStatus.CREATED);
	}

	// GET BY EMPLOYEE NAME
	@GetMapping("/Employee/name/{empname}")
	public ResponseEntity<EmployeeDto> getbyname(@PathVariable String empname) {

		EmployeeDto employeeget = this.empservise.getbyname(empname);
		return new ResponseEntity<EmployeeDto>(employeeget, HttpStatus.OK);

	}

	// GET BY DEPARTMENT NAME
	@GetMapping("/employee/department/{depaname}")
	public ResponseEntity<List<EmployeeDto>> getbydepartment(@PathVariable String depaname) {

		List<EmployeeDto> depa = this.empservise.getbydepartment(depaname);
		return new ResponseEntity<List<EmployeeDto>>(depa, HttpStatus.OK);

	}

	// GET BY COUNTRY NAME
	@GetMapping("/employee/country/{country}")
	public ResponseEntity<List<EmployeeDto>> getbycountry(@PathVariable String country) {

		List<EmployeeDto> offi = this.empservise.getbycountry(country);
		return new ResponseEntity<List<EmployeeDto>>(offi, HttpStatus.OK);

	}

}
