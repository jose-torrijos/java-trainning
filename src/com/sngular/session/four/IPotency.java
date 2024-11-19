package com.sngular.session.four;

// Predicate: Evaluacion, retorna boolean <U> -> boolean
// Consumer: Recibo algo no entrego nada <U> -> ()
// Supplier: No recibo nada y entrego algo () -> <U>
// Function: Recibo T y entrego U: <T, U> T -> U
@FunctionalInterface
public interface IPotency {

	public Double potency(Double data, Double potency);

	public default Integer suma(Integer a, Integer b) {
		return a + b;
	}
}