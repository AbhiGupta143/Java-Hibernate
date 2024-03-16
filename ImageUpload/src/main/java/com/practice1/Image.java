package com.practice1;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
@Entity
public class Image {
	@Id
	private int id;
	private String  PersonName;
	@Lob()
	@Column(columnDefinition = "MEDIUMBLOB")

	private  byte[] image;
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Image(int id, String personName, byte[] image) {
		super();
		this.id = id;
		PersonName = personName;
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonName() {
		return PersonName;
	}
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Image [id=" + id + ", PersonName=" + PersonName + ", image=" + Arrays.toString(image) + "]";
	}
	
	

}