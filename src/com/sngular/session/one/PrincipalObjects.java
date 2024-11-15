package com.sngular.session.one;

import java.util.ArrayList;
import java.util.List;

public class PrincipalObjects{
	
	private Integer edad;
	private static String nombre;
	private static List catalog;
	
	public PrincipalObjects() {
		edad = 23;
	}
	
	public PrincipalObjects(int edad) {
		this.edad = edad;
	}

	static {
		catalog = new ArrayList();
		catalog.add("1");
		catalog.add("1");
		catalog.add("1");
		nombre = "Pedro";
		System.out.println("Init uno");
	}

	{
		System.out.println("Init dos");
	}

	{
		System.out.println("Init 3");
	}

	{
		System.out.println("Init 4");
	}
	
	public void saluda(StringBuffer nombre) {
		String x = "Hola";
		
		System.out.println(nombre.append(" ALGO"));
	}
	
	public void resetNombre() {
		PrincipalObjects.nombre = "Jose";
	}

	{
		System.out.println("Init 5");
	}

	public static void main(String[] args) {
		PrincipalObjects principal = new PrincipalObjects();
		PrincipalObjects principal2 = new PrincipalObjects(30);
		PrincipalObjects principal3 = new PrincipalObjects(15);
		PrincipalObjects principal4 = new PrincipalObjects(20);


		String x = "Hola";
		String y = "Hola";
		String z = new String("Hola");

		y = "Pato";
		String w = "Pato";
		y = y + " Rojo";


		int xy = 1;
		
		principal.nombre = "Javier";
		principal2.nombre = "Luis";
		principal3.nombre = "Roberto";
		principal4.nombre = "Jaime";
		
		principal.resetNombre();
		
		
		System.out.println("Nombre1: " + principal.nombre);
		System.out.println("Edad1: " + principal.edad);
		
		System.out.println("Nombre2: " + principal2.nombre);
		System.out.println("Edad2: " + principal2.edad);
		
		System.out.println("Nombre3: " + principal3.nombre);
		System.out.println("Edad3: " + principal3.edad);
		
		System.out.println("Nombre4: " + principal4.nombre);
		System.out.println("Edad4: " + principal4.edad);
		
		StringBuffer sb = new StringBuffer("ALGO");
		principal.saluda(sb);// Hola Pedro

		sb = null;
	}

}
