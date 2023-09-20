package com.myoffice.myoffice.Servisesint;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myoffice.myoffice.Dto.Office1Dto;
import com.myoffice.myoffice.Repository.OfficeRepo;
import com.myoffice.myoffice.entities.Office1;

@Service
public class OfficeServisesimp implements OfficeServisesInt {

	@Autowired
	private OfficeRepo officerepo;

	@Autowired
	private ModelMapper modelmapper;

	public Office1 dtotooffice(Office1Dto office1dto) {
		Office1 office1 = this.modelmapper.map(office1dto, Office1.class);
		return office1;
	}

	public Office1Dto officetodto(Office1 office1) {

		Office1Dto officedto = this.modelmapper.map(office1, Office1Dto.class);
		return officedto;
	}

	@Override
	public Office1Dto addoffice(Office1Dto office1dto) {
		// TODO Auto-generated method stub
		Office1 officesave = this.dtotooffice(office1dto);
		Office1 offsave = this.officerepo.save(officesave);
		return this.officetodto(offsave);
	}

}
