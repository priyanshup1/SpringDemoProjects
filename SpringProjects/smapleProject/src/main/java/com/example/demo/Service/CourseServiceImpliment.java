package com.example.demo.Service;
import java.util.stream.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Course;
import com.example.demo.dao.CourseDao;


@Service
public class CourseServiceImpliment implements courseService {

	@Autowired
	private CourseDao cdao;
	
	public CourseServiceImpliment()
	{
		
	}
	
	@Override
	public List<Course> getcourse() {
		return cdao.findAll();
	}

	@Override
	public Course getCourseById(int cid) {
		// TODO Auto-generated method stub
		return cdao.getOne(cid);
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		cdao.save(course);
		return course;
		}

	@Override
	public void deleteCourse(int cid) {
		// TODO Auto-generated method stub
		Course en = cdao.getById(cid);
		cdao.delete(en);
	}

}
