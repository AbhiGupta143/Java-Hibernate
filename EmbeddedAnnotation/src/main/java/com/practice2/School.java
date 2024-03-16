package com.practice2;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

@Embeddable
public class School {
	
	
	private String SchoolName;
	private String SchoolAddress;
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public School(String schoolName, String schoolAddress) {
		super();
		SchoolName = schoolName;
		SchoolAddress = schoolAddress;
	}

	public String getSchoolName() {
		return SchoolName;
	}
	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}
	public String getSchoolAddress() {
		return SchoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		SchoolAddress = schoolAddress;
	}

	@Override
	public String toString() {
		return "School [SchoolName=" + SchoolName + ", SchoolAddress=" + SchoolAddress + "]";
	}
	

}
