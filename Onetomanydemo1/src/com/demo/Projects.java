package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Projects 
{

	@Id
	private int eid;
	private int ecost;
	private String ename;
	
	@ManyToOne
	private Employee emp;

	public Projects() {
		super();
		
	}

	public Projects(int eid, int ecost, String ename, Employee emp) {
		super();
		this.eid = eid;
		this.ecost = ecost;
		this.ename = ename;
		this.emp = emp;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEcost() {
		return ecost;
	}

	public void setEcost(int ecost) {
		this.ecost = ecost;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	
	
}
