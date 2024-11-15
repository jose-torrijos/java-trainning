package com.sngular.session.two.empleados;

import java.math.BigDecimal;

import com.sngular.session.two.Empleado;

public class DirectorEjecutivo extends Empleado{

	public DirectorEjecutivo(
			String id,
			String nombre,
			String apellido,
			BigDecimal salario
	) {
		super(id, nombre, apellido, salario, true);
	}
	
	{
		factorPuntualidad = 0.05f;
		setFactorResultados(0.005f);
	}

	public void calculaSalarioMensual() {
		setBonoPuntualidad(getSalario().multiply(new BigDecimal(factorPuntualidad)));
		setBonoResultados(getSalario().multiply(new BigDecimal(getFactorResultados())));
		
		BigDecimal salarioMensual = getSalario().add(getBonoPuntualidad()).add(getBonoResultados());
		
		System.out.println("El salario mensual es: " + salarioMensual.doubleValue());
	}

}
