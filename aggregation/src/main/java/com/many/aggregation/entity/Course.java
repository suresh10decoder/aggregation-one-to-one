package com.many.aggregation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name="course")
public class Course {
	@Id
	@GeneratedValue
	private long id;
	private String coursename;
	private String college;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Student student;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", coursename=" + coursename + ", college=" + college + "]";
	}
	

}
