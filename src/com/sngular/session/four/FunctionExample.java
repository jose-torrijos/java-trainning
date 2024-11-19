package com.sngular.session.four;
import java.util.function.Function;

public class FunctionExample implements Function<Integer, String>{

	@Override
	public String apply(Integer t) {
		return "Numero: " + t.toString();
	}
}
