package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


          @NamedQuery( name="findbyname", 
        		  query="select * from empdetail where ename=:name")
   


@Entity
public class Employee 
{

	@Id
	private int eid;
	private String ename;
	private int esalary;
	private String ejob;
	
	public Employee() 
	{
		super();	
	}

	public Employee(int eid, String ename, int esalary, String ejob) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.ejob = ejob;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	public String getEjob() {
		return ejob;
	}

	public void setEjob(String ejob) {
		this.ejob = ejob;
	}
	
	
	
}
