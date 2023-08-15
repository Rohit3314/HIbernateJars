package com.demo;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Onetoone 
{

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException 
	{
          Configuration con = new Configuration();
          con.configure("hibernate.cfg.xml");
          
          SessionFactory sf = con.buildSessionFactory();
          Session session =sf.openSession();
          
          org.hibernate.Transaction tx =  session.beginTransaction();
          
          Student s1 = new Student();
          Subject s2 = new Subject();
          
          s1.setSid(111); s1.setSname("abc"); s1.setSage(24); s1.setSub(s2);
          session.save(s1);
          s2.setMarks(88); s2.setSubname("english"); s2.setSid(s1.getSid());
          session.save(s2);
          tx.commit();
		
	}

}

