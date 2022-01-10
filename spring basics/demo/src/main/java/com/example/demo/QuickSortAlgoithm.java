package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgoithm  implements sortAlgorithm {
public int [] sort(int [] numbers) {
	return numbers;
}
}
