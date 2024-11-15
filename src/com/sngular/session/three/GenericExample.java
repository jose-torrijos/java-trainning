package com.sngular.session.three;

public class GenericExample<U> {
	
	//extends Soy hijo de ?
	//super Papa ?

	private U dato;

	public GenericExample(U dato) {
		super();
		this.dato = dato;
	}

	public U getDato() {
		return dato;
	}

	public void setDato(U dato) {
		this.dato = dato;
	}
	
}
