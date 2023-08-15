package com.demo;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Fetch
{
	public static void main(String[] args) 
	{
	  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();	
      Metadata mt = new MetadataSources(ssr).getMetadataBuilder().build();
	  
      SessionFactory sf = mt.getSessionFactoryBuilder().build();
      Session s1 = sf.openSession();
      
      TypedQuery tq = s1.getNamedQuery("findbyname");
      tq.setParameter("name","amit");
      
      List<Employee> e1 = tq.getResultList();
      
      Iterator<Employee> es = e1.iterator();
      while(es.hasNext())
      {
    	  Employee e = es.next();
    	  System.out.println(e);
      }
      s1.close();
	}

}
