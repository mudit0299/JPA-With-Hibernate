package com.example.database;



import java.util.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.database.entity.Person;
import com.example.database.jdbc.PersonJdbcDAO;




public class SpringJdbcDemoApplication implements CommandLineRunner {
	
	private Logger logger=org.slf4j.LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info("aLL users->{}",dao.findAll());
		logger.info("user id 10001 ->{}",dao.findById(10001));
		logger.info("user id 10002 ->{}",dao.deleteById(10002));
		logger.info("inserting 10005->{}",dao.insert(new Person(10005,"erstrdtyfugy","delhi",new Date())));
		logger.info("updating 1000->{}",dao.update(new Person(10003,"jatin","noida",new Date())));
		
	}

}
