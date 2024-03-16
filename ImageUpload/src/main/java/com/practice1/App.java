package com.practice1;

import java.io.FileInputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
       
      SessionFactory  factory=cfg.buildSessionFactory();
      Image i=new Image();
      i.setId(0);
      i.setPersonName("Ankit");     
     try {
		FileInputStream a=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\ImageUpload\\src\\main\\java\\pexels-pixabay-327158.jpg");
		  byte[] data = new byte[a.available()];
          a.read(data);
          i.setImage(data);

	} catch (Exception e) {
		e.printStackTrace();
	}
     System.out.println(i);
    Session session = factory.openSession();     
  Transaction tx=session.beginTransaction();
     session.save(i);      
     tx.commit();
     factory.close();
    session.close();
    


         System.out.println("Saved successfully.");
     
 
    	
    }
}