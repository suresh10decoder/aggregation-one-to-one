package com.many.aggregation.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.many.aggregation.entity.Course;
import com.many.aggregation.entity.Student;
import com.many.aggregation.repository.AggregationRepository;
import com.many.aggregation.repository.AggregationRepositoryTwo;
//import com.many.aggregation.repository.AggregationRepositoryTwo;
@Component
public class AggregationService
{
	@Autowired
	AggregationRepository repository;
	
	@Autowired
	AggregationRepositoryTwo repo;
	
	public Student insert(Student add)
	{
		return repository.save(add);
		
	}
	public ArrayList<Student> get()
	{
		return (ArrayList<Student>) repository.findAll();
	}
	public Student update(Student alter)
	{
		return repository.save(alter);
	}
	public long remove(long id)

	{
		
	 repository.deleteById(id);
				return id;
	}
	
	
	
	//CourseEntity data
	public Course newInsert(Course add)
	{
		return repo.save(add);
		
	}
	public ArrayList<Course> getall()
	{
		return (ArrayList<Course>) repo.findAll();
	}
	public Course update(Course alter)
	{
		return repo.save(alter);
	}
	public long delete(long id)

	{
		
	 repo.deleteById(id);
				return id;
	}
}