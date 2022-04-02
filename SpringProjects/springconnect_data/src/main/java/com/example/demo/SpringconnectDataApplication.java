package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringconnectDataApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbctemplate;
	/*public class JdbcTemplate {
		
	}*/
	public static void main(String[] args) {
		SpringApplication.run(SpringconnectDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO msm (messagee) values ('hello cena')";
		 
		int rows = jdbctemplate.update(sql);
//		if(rows > 0)
//		{
//			System.out.println("new row has been inserted");
//		}
		
	}

}
