package com.sngular.session.two;//C

import java.math.BigDecimal;//D

public abstract class Empleado{//U
	private String id;
	private String nombre;
	private String apellido;
	private BigDecimal salario;
	private BigDecimal bonoPuntualidad;
	private BigDecimal bonoResultados;
	protected float factorPuntualidad;
	float factorResultados;
	private boolean bonos;
	
	public Empleado() {
		super();
		this.factorPuntualidad = 0.002f;
		this.factorResultados = 0.002f;
	}

	public Empleado(
			String id,
			String nombre,
			String apellido,
			BigDecimal salario,
			boolean bonos
	) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.bonos = bonos;
	}
	
	public abstract void calculaSalarioMensual();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public BigDecimal getBonoPuntualidad() {
		return bonoPuntualidad;
	}

	public void setBonoPuntualidad(BigDecimal bonoPuntualidad) {
		this.bonoPuntualidad = bonoPuntualidad;
	}

	public BigDecimal getBonoResultados() {
		return bonoResultados;
	}

	public void setBonoResultados(BigDecimal bonoResultados) {
		this.bonoResultados = bonoResultados;
	}

	public float getFactorResultados() {
		return factorResultados;
	}

	public void setFactorResultados(float factorResultados) {
		this.factorResultados = factorResultados;
	}

	public boolean isBonos() {
		return bonos;
	}

	public void setBonos(boolean bonos) {
		this.bonos = bonos;
	}
}
