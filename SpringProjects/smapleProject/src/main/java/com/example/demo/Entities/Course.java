package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {

	@Id
	private long id;
	private String title;
	private String dispriction;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDispriction() {
		return dispriction;
	}
	public void setDispriction(String dispriction) {
		this.dispriction = dispriction;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", dispriction=" + dispriction + "]";
	}
	
	
}
