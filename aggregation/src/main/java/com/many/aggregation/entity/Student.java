package com.many.aggregation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name="student")
public class Student
{
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private float mark;
	
	
//	private Course course;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}
}