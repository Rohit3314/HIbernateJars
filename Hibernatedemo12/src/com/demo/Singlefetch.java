package com.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class Singlefetch
{
	public static void main(String[] args)
	{
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Student> cq = cb.createQuery(Student.class);
		
		Root<Student> stud = cq.from(Student.class);
		cq.multiselect(stud.get("sid"),stud.get("sname"),stud.get("sage"));
		
		CriteriaQuery<Student> select = cq.select(stud);
		TypedQuery<Student> q = em.createQuery(select);
		List<Student> l1 = q.getResultList();
		
		System.out.println("-------------------------------");
		System.out.print("id"+"       ");
		System.out.print("name"+"     "); 
		System.out.println(" age"+"   ");
        System.out.println("-------------------------------");

		for(Student s1 : l1)
		{
			System.out.print(s1.getSid()+"         ");
			System.out.print(s1.getSname()+"       ");
			System.out.print(s1.getSage());
            System.out.println();
			
		}
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
