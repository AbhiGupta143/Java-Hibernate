package com.practice5;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	 Configuration cfg=new Configuration(); 
    	 cfg.configure("Hibernate.cfg.xml");
    	   SessionFactory factory=cfg.buildSessionFactory();
    	   
    	   
    	 Session session = factory.openSession(); 
    	   Transaction t = session.beginTransaction(); 
    	   
    	   Answer a=new Answer();
    	   a.setId(1);
    	   a.setAnswerName("DotNet Is a programming Language");
    	   a.setPostedy("preeti singh");
    	   
    	   Answer a1=new Answer();
    	   a1.setId(2);
    	   a1.setAnswerName("DotNet is highLevel Language");
    	   a1.setPostedy("Sudha");
    	    
    	   Answer a2=new Answer();
    	   a2.setId(3);
    	   a2.setAnswerName("Java Is a programming Language");
    	   a2.setPostedy("preeti sahu");
    	   
    	   Answer a3=new Answer();
    	   a3.setId(4);
    	   a3.setAnswerName("java is platform Independent");
    	   a3.setPostedy("urvi");
    	   
    	   Question q=new Question();
    	   q.setId(121);
    	   q.setQuestionName("What is DotNet");
    	   ArrayList<Answer>ans=new ArrayList<>();
    	   ans.add(a);
    	   ans.add(a1);
    	   q.setAmswer(ans);
    	   
    	   Question q1=new Question();
    	   q1.setId(122);
    	   q1.setQuestionName("What is java");
    	   ArrayList<Answer>ans1=new ArrayList<>();
    	   ans1.add(a2);
    	   ans1.add(a3);
    	   q1.setAmswer(ans1);
    	   
    	   session.save(q);
    	   session.save(q1);
    	   
    	   t.commit();
    	   session.close();
    	   
    	   System.out.println("complete Mapping task");
    	   
    	   
    	   
    	   
    }
}