package com.example.database;



import java.util.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import com.example.database.entity.Person;
import com.example.database.jdbc.PersonJdbcDAO;
import com.example.database.jpa.PersonJpaRepository;



@SpringBootApplication
public class JPADemoApplication implements CommandLineRunner {
	
	private Logger logger=org.slf4j.LoggerFactory.getLogger(this.getClass());
	@Autowired
	 PersonJpaRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(JPADemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info("aLL users->{}",repo.findAll());
		logger.info("user id 10001 ->{}",repo.findById(10001));
//		logger.info("user id 10002 ->{}",dao.deleteById(10002));
		logger.info("inserting 10005->{}",repo.insert(new Person(10005,"erstrdtyfugy","delhi",new Date())));
		logger.info("updating 1000->{}",repo.update(new Person(10003,"jatin","noida",new Date())));
		
		repo.deleteByid(10002);
		
	}

}
