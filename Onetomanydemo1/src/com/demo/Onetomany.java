package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Onetomany
{
	
	public static void main(String args[])
	{
	
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		
		SessionFactory sf = c.buildSessionFactory();
		Session s1 = sf.openSession();
		
	    org.hibernate.Transaction tx =  s1.beginTransaction();

	    Employee e1 = new Employee();
	    Projects p2 = new Projects();
	    Projects p3 = new Projects();
	    
	    e1.setEid(111); e1.setEname("abc"); e1.setEage(24); 
	    e1.getP1().add(p2); e1.getP1().add(p3);
	    s1.save(e1);
	    
	    p2.setEcost(50000); p2.setEname("xyz"); p2.setEid(e1.getEid());
	    s1.save(p2);
	    
	     p3.setEcost(30000); p3.setEname("pqr"); p3.setEid(e1.getEid());
	     s1.save(p3);
	     
	    
	    
	    tx.commit();
	   
	}

}
