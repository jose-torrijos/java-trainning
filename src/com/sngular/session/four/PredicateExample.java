package com.sngular.session.four;
import java.util.function.Predicate;

public class PredicateExample implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		return t < 0 ? true : false;
	}
}
