package com.many.aggregation.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.many.aggregation.entity.Student;

@Repository
public interface  AggregationRepository extends JpaRepository<Student ,Long>
{
	
}