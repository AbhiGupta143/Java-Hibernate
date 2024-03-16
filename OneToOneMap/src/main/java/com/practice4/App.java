package com.practice4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration(); 
	    cfg.configure("Hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    
	    Question q1 = new Question();
	    q1.setQ_Id(1212);
	    q1.setQuestionName("What is Java");
	    
	    Answer answer = new Answer();
	    answer.setAnswerId(343);
	    answer.setAnswer("Java is programming language");
	    answer.setQuestion(q1);
	    
	    Question q2 = new Question();
	    q2.setQ_Id(1213);
	    q2.setQuestionName("What is Collection FrameWork");
	    
	    Answer answer1 = new Answer();
	    answer1.setAnswerId(348);
	    answer.setAnswer("Api to work with object in java");
	    answer.setQuestion(q2);
	    
	    
	    q1.setAnswer(answer);
	    q2.setAnswer(answer1);
	    
	    
	    Session s= factory.openSession();
	    Transaction t = s.beginTransaction();
	    
	    s.save(q1);
	    s.save(q2);
	    s.save(answer);
	    s.save(answer1);
	    t.commit();
	    
	    s.close();
	    
	    factory.close();
	    
	    System.out.println("One to One Done");
    }
}
