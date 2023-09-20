package com.myoffice.myoffice.Servisesint;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myoffice.myoffice.Dto.DepartmentDto;

import com.myoffice.myoffice.Repository.DepartmentRepo;
import com.myoffice.myoffice.entities.Department;

@Service
public class Departmentimp implements Departmentint {

	@Autowired
	private DepartmentRepo departmentrepo;

	@Autowired
	private ModelMapper modelmapper;

	public Department dtotodepartment(DepartmentDto departmentdto) {
		Department department = this.modelmapper.map(departmentdto, Department.class);
		return department;
	}

	public DepartmentDto departmenttodto(Department department) {

		DepartmentDto departmentdto = this.modelmapper.map(department, DepartmentDto.class);
		return departmentdto;
	}

	@Override
	public DepartmentDto adddepartment(DepartmentDto departmentdto) {
		// TODO Auto-generated method stub
		System.out.println("departservises " + departmentdto);
		Department departmentsave = this.dtotodepartment(departmentdto);
		System.out.println("dtotodepartment " + departmentsave);
		Department departsave = this.departmentrepo.save(departmentsave);
		System.out.println("save " + departsave);
		return this.departmenttodto(departsave);

	}


}
