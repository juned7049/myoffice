package com.myoffice.myoffice.MyController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myoffice.myoffice.Dto.Office1Dto;

import com.myoffice.myoffice.Servisesint.OfficeServisesimp;

@RestController
public class OfficeController {

	@Autowired
	private OfficeServisesimp officeservise;

	@PostMapping("/office")
	public ResponseEntity<Office1Dto> addoffice(@RequestBody Office1Dto office1dto) {
		Office1Dto offdto = this.officeservise.addoffice(office1dto);
		return new ResponseEntity<Office1Dto>(offdto, HttpStatus.ACCEPTED);
	}

}
