package com.sngular.session.four;
import java.util.Random;
import java.util.stream.Stream;

public class FunctionalInterfaces {
	
	public static void main(String [] args) {
		double data = 5.0;
		double potency = 7.5;
		IPotency calculatePotency = ((a, b) -> Math.pow(a, b));
		
		System.out.println(calculatePotency.potency(data, potency));
		
		SupplierExample exampleS = new SupplierExample();
		ConsumerExample exampleC = new ConsumerExample();
		PredicateExample exampleP = new PredicateExample();
		FunctionExample exampleF = new FunctionExample();
		
		Stream.generate(exampleS)
			.filter(exampleP)
			.limit(10)
			.forEach(exampleC);
		
		Stream.generate(() -> new Random().nextInt())
		.filter((numero) -> numero < 0 ? true : false)
		.limit(10)
		.forEach(System.out::println);
		
		Stream.generate(exampleS).limit(10).map(exampleF).forEach(System.out::println);
		
		Stream.generate(() -> new Random().nextInt())
			.limit(10)
			.map((value) -> {
				return "Numero: " + value.toString();
			})
			.forEach(System.out::println);
	}
}
