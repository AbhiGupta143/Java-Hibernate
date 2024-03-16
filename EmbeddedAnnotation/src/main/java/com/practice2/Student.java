package com.practice2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_Record")
public class Student {
	@Id
	private int Id;
	private String SName;
	private int ROllNo;
	
	private School school;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String sName, int rOllNo, School school) {
		super();
		this.Id = Id;
		SName = sName;
		ROllNo = rOllNo;
		this.school = school;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public int getROllNo() {
		return ROllNo;
	}
	public void setROllNo(int rOllNo) {
		ROllNo = rOllNo;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", SName=" + SName + ", ROllNo=" + ROllNo + ", School=" + school + "]";
	}

	 
}
