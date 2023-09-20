package com.myoffice.myoffice.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myoffice.myoffice.entities.Department;
import com.myoffice.myoffice.entities.Employee;
import com.myoffice.myoffice.entities.Office1;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	public Employee findByEmpname(String empname);

	public List<Employee> findByOffice1(Office1 office1);

	public List<Employee> findByDepartment(Department department);
}
