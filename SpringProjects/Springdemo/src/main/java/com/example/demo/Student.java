package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int sid;
	private String sname;
	@Autowired
	private Exam exam;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public void diplay()
	{
		setSid(101);
		setSname("aj");
		//exam.toString();
		
	}
	@Override
	public String toString() {
		setSid(101);
		setSname("aj");
		exam.setMarks(98);
		exam.setStatus("pass");
		return "Student [sid = "  + sid + " , sname = " + sname + " , exam = " + exam + "]";
	}
	
	
	
}
