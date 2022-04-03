package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Exam {
	
	private int marks ;
	private String status;
	
	
	
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Exam [marks=" + marks + ", status=" + status + "]";
	}

}
