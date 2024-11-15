package com.sngular.session.three;

public class TryExample implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Me cerre!");
		
	}

}
