package com.practice;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration(); 
    	 cfg.configure("Datastd.cfg.xml");
    	   SessionFactory factory=cfg.buildSessionFactory();
    	   StudentDataBean std=new StudentDataBean();
    	   
    	   Session session = factory.openSession(); 
    	  Transaction t = null;
    	   try {
               t = session.beginTransaction();

               List<StudentDataBean> students = new ArrayList<>();

               // Create multiple Employee instances using a loop
             
                   StudentDataBean student = new StudentDataBean();
                   students.add(new StudentDataBean(1 , "Ajit" , 101));
                   students.add(new StudentDataBean(2 , "shajit" , 102));
                   students.add(new StudentDataBean(3 , "nimit" , 103));
                   students.add(new StudentDataBean(4 , "mohat" , 104));
                   students.add(new StudentDataBean(5 , "kiol" , 105));
                           
                  
                

               // Save each employee
               for (StudentDataBean i : students) {
                   session.save(i);
               }

               t.commit();
           } catch (HibernateException e) {
               if (t != null) {
                   t.rollback();
               }
               e.printStackTrace(); 
           } finally {
               session.close();
           }
    	   
    }
}
   