package com.myoffice.myoffice.Dto;

public class DepartmentDto {

	private int depid;
	private String depaname;

	public DepartmentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepartmentDto(int depid, String depaname) {
		super();
		this.depid = depid;
		this.depaname = depaname;
	}

	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public String getDepaname() {
		return depaname;
	}

	public void setDepaname(String depaname) {
		this.depaname = depaname;
	}

}
