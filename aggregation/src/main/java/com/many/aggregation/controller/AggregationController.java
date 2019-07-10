package com.many.aggregation.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.many.aggregation.entity.Course;
import com.many.aggregation.entity.Student;
import com.many.aggregation.service.AggregationService;

@RestController
@RequestMapping("aggregation")
public class AggregationController
{
	@Autowired
	AggregationService service;
	
	@PostMapping("/")
	public Student insert(@RequestBody Student add)
	{
		return service.insert(add);
	}
	@GetMapping("/")
	public  ArrayList<Student> get()
	{
		return service.get();
	}
	@PutMapping("update/{id}")
	public Student update(@PathVariable long id,@RequestBody Student alter)
	{
		return service.update(alter);
	}
	@DeleteMapping("delete/{id}")
	public long remove(@PathVariable long id,@RequestBody Student cancel)
	{
		return service.remove(id);
	}
	
	
	@PostMapping("/course")
	public Course newInsert(@RequestBody Course add)
	{
		return service.newInsert(add);
	}
	@GetMapping("/course")
	public  ArrayList<Course> getall()
	{
		return service.getall();
	}
	@PutMapping("/{id}")
	public Course update(@PathVariable long id,@RequestBody Course alter)
	{
		return service.update(alter);
	}
	@DeleteMapping("/{id}")
	public long delete(@PathVariable long id,@RequestBody Course cancel)
	{
		return service.delete(id);
	}
	
}