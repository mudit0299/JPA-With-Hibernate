package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private sortAlgorithm sortAlgorithm;
	 
public BinarySearchImpl(sortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

public BinarySearchImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Sort array
	//search array
	public int binarySearch(int [] numbers,int numberToSearchFor ) {
		//sort 
			//BubbleSortAlgorithm bsa=new BubbleSortAlgorithm();
			int [] sortednumbers=sortAlgorithm.sort(numbers);
			System.out.println(sortAlgorithm);
		//Binary search
		return 3;
	}
}
