package com.practice5;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="ManyQuestion")
public class Question {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String questionName;
	
	 @ManyToMany(targetEntity=Answer.class,cascade= {CascadeType.ALL})
	private List<Answer>amswer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public List<Answer> getAmswer() {
		return amswer;
	}
	public void setAmswer(List<Answer> amswer) {
		this.amswer = amswer;
	}
	

}