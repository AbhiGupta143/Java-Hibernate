package com.practice2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration(); 
   	    cfg.configure("Hibernate.cfg.xml");
   	   SessionFactory factory=cfg.buildSessionFactory();
   	   
   	   Session session = factory.openSession();
   	   Transaction t = session.beginTransaction();
   	   
   	   Student s = new Student();
   	   s.setId(2);
   	   s.setSName("Ravi");
   	   s.setROllNo(101);
   	   School s1 = new School();
   	   s1.setSchoolName("Railworld");
   	   s1.setSchoolAddress("Gurgaon");
   	   
   	   s.setSchool(s1);
   	   session.save(s);
   	   t.commit();
   	   session.close();
   	   factory.close();
    }
}
