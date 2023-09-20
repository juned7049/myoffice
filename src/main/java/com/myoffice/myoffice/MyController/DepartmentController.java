package com.myoffice.myoffice.MyController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myoffice.myoffice.Dto.DepartmentDto;
import com.myoffice.myoffice.Dto.EmployeeDto;
import com.myoffice.myoffice.Servisesint.Departmentimp;

@RestController
public class DepartmentController {

	@Autowired
	private Departmentimp depservise;

	@PostMapping("/department")
	public ResponseEntity<DepartmentDto> adddepartment(@RequestBody DepartmentDto departmentdto) {
		System.out.println(" " + departmentdto);
		DepartmentDto departdto = this.depservise.adddepartment(departmentdto);
		System.out.println(" " + departdto);
		return new ResponseEntity<DepartmentDto>(departdto, HttpStatus.ACCEPTED);
	}

}
