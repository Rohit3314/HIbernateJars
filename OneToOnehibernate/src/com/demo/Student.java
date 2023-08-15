package com.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student 
{
    @Id
	private int sid;
	private String sname;
	private int sage;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	private Subject sub;

	public Student() {
		super();
		
	}

	public Student(int sid, String sname, int sage, Subject sub) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.sub = sub;
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

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	
	
}
