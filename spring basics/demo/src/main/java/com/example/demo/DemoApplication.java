package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		//BinarySearchImpl binary=new BinarySearchImpl( new QuickSortAlgoithm());
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		BinarySearchImpl binarySearch=applicationContext.getBean(BinarySearchImpl.class);
		int res=binarySearch.binarySearch(new int[]{12,4,6}, 3);
		System.out.println(res);
	}

}
