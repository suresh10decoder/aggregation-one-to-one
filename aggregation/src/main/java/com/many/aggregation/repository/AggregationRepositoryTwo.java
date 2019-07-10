package com.many.aggregation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.many.aggregation.entity.Course;

@Repository
public interface AggregationRepositoryTwo extends JpaRepository<Course,Long> {

}
