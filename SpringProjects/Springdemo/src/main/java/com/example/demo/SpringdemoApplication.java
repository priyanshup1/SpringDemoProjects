package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(SpringdemoApplication.class, args);
		
//		//System.out.println("hello\nwellcome to Priyanshu's new project");
//		Student s = context.getBean(Student.class);
//		//s.diplay();
		//System.out.println(s.toString());
	System.out.println("hello .....");
	}

}
