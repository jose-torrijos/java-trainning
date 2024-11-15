package com.sngular.session.four;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Principal {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		Random random = new Random();
		
		for(int i = 0; i < 10; i++) {
			numbers.add(random.nextInt(15));
		}
		
		Stream<Integer> streamIntegers = numbers.stream();
		Stream<Integer> streamInt = numbers.stream();
	}
}
