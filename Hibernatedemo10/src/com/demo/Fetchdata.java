package com.demo;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Fetchdata
{

	public static void main(String[] args) 
	{
		
		
		new Persistence();
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("Student");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		 //Query q = em.createQuery("select s.sname from Student s");
		 String s1 = "insert into Student values(101,22,'abc')";
		  Query q =  em.createNamedQuery(s1) ;
		 /*  @SuppressWarnings("unchecked")
		List<Integer> l1 = q.getResultList();
		 System.out.println("Student List");
		 for(int name1:l1)
		 {
	 	System.out.println(name1);
	    	}   */
		 
		      int result = q.executeUpdate();
			 	System.out.println(result);

		em.close();
        emf.close();
	}

}
