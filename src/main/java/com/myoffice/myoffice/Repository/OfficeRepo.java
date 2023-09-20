package com.myoffice.myoffice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myoffice.myoffice.entities.Office1;

public interface OfficeRepo extends JpaRepository<Office1, Integer> {

	public Office1 findByCountry(String country);
}
