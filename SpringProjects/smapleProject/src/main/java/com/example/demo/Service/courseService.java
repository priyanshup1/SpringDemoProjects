package com.example.demo.Service;
import java.util.List;

import com.example.demo.Entities.Course;

public interface courseService {

	public List<Course> getcourse();
	public Course getCourseById(int cid);
	public Course addCourse(Course course);
	public void deleteCourse(int cid);
}
