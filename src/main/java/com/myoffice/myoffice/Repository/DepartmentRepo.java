package com.myoffice.myoffice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myoffice.myoffice.entities.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

	public Department findByDepaname(String depaname);

}
