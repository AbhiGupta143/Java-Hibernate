package com.practice4;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	@Column(name = "Question_Id")
	private int Q_Id;
	
	private String QuestionName;
	
	@OneToOne
	private Answer answer;
	
	public int getQ_Id() {
		return Q_Id;
	}
	public void setQ_Id(int q_Id) {
		Q_Id = q_Id;
	}
	public String getQuestionName() {
		return QuestionName;
	}
	public void setQuestionName(String questionName) {
		QuestionName = questionName;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public Question(int q_Id, String questionName, Answer answer) {
		super();
		Q_Id = q_Id;
		QuestionName = questionName;
		this.answer = answer;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
