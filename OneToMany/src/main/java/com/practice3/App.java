package com.practice3;

import java.util.ArrayList;

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
   	    SessionFactory factory=cfg.buildSessionFactory();
   	    
   	   Session session = factory.openSession();
 	   Transaction t = session.beginTransaction();
 	   
 	   Answer a = new Answer();
 	   a.setAnswerName("Python is a programming Language ");
 	   a.setPostedBy("Ankit Nashine");
 	  
 	   Answer a1 = new Answer();
 	   a1.setAnswerName("Python is platform Independent ");
 	   a1.setPostedBy("A");
 	  
 	   Answer a2 = new Answer();
 	   a2.setAnswerName("ReactJs is a programming Language ");
 	   a2.setPostedBy("manjit"); 
 	   
 	   Answer a3 = new Answer();
 	   a3.setAnswerName("C++ is a programming Language ");
 	   a3.setPostedBy("Ankita Nashine");
 	   
 	   ArrayList<Answer> list1 = new ArrayList();
 	   list1.add(a);
 	   list1.add(a1);
 	   ArrayList<Answer>list2  = new ArrayList();
 	   list2.add(a2); 
 	   list2.add(a3);
 	   
 	   Question q = new Question();
 	   q.setQuestionName("What is Python");
 	   q.setAnswer(list1);
 	   
 	  Question q1 = new Question();
	   q1.setQuestionName("What is ReactJs");
	   q1.setAnswer(list2);
	   
	   session.persist(q);
	   session.persist(q1);
	   
	   t.commit();
	   session.close();
	   
	   
	   System.out.println("Saved Data");
    }
}
 