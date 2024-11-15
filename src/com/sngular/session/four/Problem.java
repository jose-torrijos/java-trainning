/**
 * 1. Crear una lista de 10 numeros enteros
 * 2. Buscar los negativos
 * 3. Mostrarlos en pantalla
 * 4. Formato a cadena de los negativos
 * 
 */
package com.sngular.session.four;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Problem {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		List<Integer> negativos = new ArrayList<Integer>();
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			numeros.add(random.nextInt());
		}
		
		for(Integer i : numeros) {
			if(i < 0) negativos.add(i);
		}
		
		for(Integer neg: negativos) {
			System.out.println(neg);
		}
		
		for(Integer neg: negativos) {
			System.out.println("Numero: " + neg.toString());
		}
		
		PredicateExample predicateExample = new PredicateExample();
		ConsumerExample consumerExample = new ConsumerExample();
		SupplierExample supplierExample = new SupplierExample();
		FunctionExample functionExample = new FunctionExample();
		
		Consumer<String> consumerStrings = (value) -> System.out.println(value);
		
		Stream
			.generate(supplierExample)
			.limit(10)
			.filter(predicateExample)
			.forEach(consumerExample);
		
		Stream.generate(supplierExample)
		.limit(10)
		.map(functionExample)//10 cadenas
		.forEach(consumerStrings);
		
//		Random::new
		
		Stream
			.generate(() -> new Random().nextInt())
			.limit(10)
			.filter((value) -> {
				return value < 0 ? true : false;
			})
			//.forEach((value) -> System.out.println(value));
			.forEach(System.out::println);
	}
}
