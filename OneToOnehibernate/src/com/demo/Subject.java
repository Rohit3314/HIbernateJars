package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject
{
    @Id
	private int sid;
	private int marks;
	private String subname;
	
	
	public Subject() {
		super();
	}
	public Subject(int sid, int marks, String subname) {
		super();
		this.sid = sid;
		this.marks = marks;
		this.subname = subname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	
	
	
}
