package com.practice5;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ManyAnswer")
public class Answer {
	@Id
	//@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswerName() {
		return answerName;
	}
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}
	public String getPostedy() {
		return postedy;
	}
	public void setPostedy(String postedy) {
		this.postedy = postedy;
	}
	private String answerName;
	private String postedy;
	

	
}