package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		BinarySearchImpl binary=new BinarySearchImpl( new QuickSortAlgoithm());
		int res=binary.binarySearch(new int[]{12,4,6}, 3);
		System.out.println(res   );
		//SpringApplication.run(DemoApplication.class, args);
	}

}
