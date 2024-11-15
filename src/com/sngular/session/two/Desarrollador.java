package com.sngular.session.two;

import java.math.BigDecimal;

public class Desarrollador extends Empleado{
	
	boolean esLider;

	public Desarrollador() {
		super();
	}

	public Desarrollador(
			String id,
			String nombre,
			String apellido,
			BigDecimal salario,
			boolean bonos
	) {
		super(id, nombre, apellido, salario, bonos);
		factorPuntualidad = 0.02f;
	}

	@Override
	public void calculaSalarioMensual() {
		BigDecimal salarioMensual = BigDecimal.ZERO;
		if(isBonos()) {
			setBonoPuntualidad(getSalario().multiply(new BigDecimal(factorPuntualidad)));
			if(esLider) {
				factorResultados = 0.003f;
				setBonoResultados(getSalario().multiply(new BigDecimal(factorResultados)));
			}
			salarioMensual = getSalario().add(getBonoPuntualidad()).add(getBonoResultados());
			System.out.println("El salatio mensual es: " + salarioMensual.doubleValue());
		} else {
			System.out.println("El salatio mensual es: " + getSalario());
		}
	}

	public boolean isEsLider() {
		return esLider;
	}

	public void setEsLider(boolean esLider) {
		this.esLider = esLider;
	}
	
	

}
