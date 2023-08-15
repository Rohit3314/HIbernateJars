package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student
{
    @Id
	private int sid;
	private String sname;
	private int sage;
	
	
	
	public Student() {
		super();
		
	}
	public Student(int sid, String sname, int sage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	
	
	
}