package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	int rid;
	String uname;
	int marks;
	String city;
	public Student()
	{
		
	}
	public Student(int rid, String uname, int marks, String city) {
		super();
		this.rid = rid;
		this.uname = uname;
		this.marks = marks;
		this.city = city;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
