package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Course;
import com.example.demo.Service.courseService;

@RestController
public class mycontroller  {
	@Autowired
	private courseService cservice;
	//get all the course
	
	@GetMapping("/course")
	public List<Course> getcourse()
	{
		return this.cservice.getcourse();
		
	}
	@GetMapping("/course/{cid}")
	public Course getCourseById(@PathVariable String cid)
	{
		return this.cservice.getCourseById(Integer.parseInt(cid));
		
	}
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course)
	{
		return this.cservice.addCourse(course);
		
	}
}
		
