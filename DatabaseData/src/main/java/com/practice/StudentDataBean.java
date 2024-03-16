package com.practice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="STudentRecord")

public class StudentDataBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private int Roll_No;
	public StudentDataBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDataBean(int id, String name, int roll_No) {
		super();
		this.id = id;
		Name = name;
		Roll_No = roll_No;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	@Override
	public String toString() {
		return "StudentDataBean [id=" + id + ", Name=" + Name + ", Roll_No=" + Roll_No + "]";
	}
	public void add(StudentDataBean studentDataBean) {
		// TODO Auto-generated method stub
		
	}
	
}
