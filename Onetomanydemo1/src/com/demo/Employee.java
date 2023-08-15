package com.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee
{

	@Id
	private int eid;
	private String ename;
	private int eage;
	
	@OneToMany(mappedBy="emp" ,cascade=CascadeType.ALL)
	private List<Projects> p1;

	
	public Employee() {
		super();
		
	}

	public Employee(int eid, String ename, int eage, List<Projects> p1) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.p1 = p1;
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



	public int getEage() {
		return eage;
	}



	public void setEage(int eage) {
		this.eage = eage;
	}



	public List<Projects> getP1() {
		return p1;
	}



	public void setP1(List<Projects> p1) {
		this.p1 = p1;
	}
	
	
	
	
}
