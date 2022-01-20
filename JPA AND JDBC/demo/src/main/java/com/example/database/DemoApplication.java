package com.example.database;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.database.jdbc.PersonJdbcDAO;



@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	private Logger logger=org.slf4j.LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info("aLL users->{}",dao.findAll());
		logger.info("user id 10001 ->{}",dao.findById(10001));
		logger.info("user id 10002 ->{}",dao.deleteById(10002));
	}

}
