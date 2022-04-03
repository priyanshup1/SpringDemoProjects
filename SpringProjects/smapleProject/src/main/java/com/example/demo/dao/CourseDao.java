package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Course;
//  ____________________________________________entity,___,pk_____
public interface CourseDao extends JpaRepository<Course, Integer>{

}
