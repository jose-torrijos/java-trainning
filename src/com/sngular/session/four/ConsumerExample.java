package com.sngular.session.four;
import java.util.function.Consumer;

public class ConsumerExample implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);

	}

}