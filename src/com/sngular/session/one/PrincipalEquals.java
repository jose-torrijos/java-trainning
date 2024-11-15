package com.sngular.session.one;

public class PrincipalEquals {
	public static void main(String[] args) {
		Integer numero1 = 1;
		Integer numero2 = Integer.valueOf(2);
		int numero3 = new Integer(1).intValue();
		int numero4 = numero1;
		
		System.out.println("(numero1 == numero2): " + (numero1 == numero2));
		System.out.println("(numero1 == numero3): " + (numero1 == numero3));
		System.out.println("(numero1 == numero4): " + (numero1 == numero4));
		
		Persona prueba1 = new Persona();
		Persona prueba2 = new Persona();
		Persona prueba3 = prueba1;
		
		System.out.println("(prueba1 == prueba2): " + (prueba1 == prueba2));
		System.out.println("(prueba1 == prueba3): " + (prueba1 == prueba3));
		
		prueba1.nombre = "Victor";
		prueba1.edad = 20;
		prueba1.sexo = "Macho";
		
		prueba2.nombre = "Victor";
		prueba2.edad = 20;
		prueba2.sexo = "Macho";
		
		System.out.println("(prueba1.equals(prueba2)): " + (prueba1.equals(prueba2)));
		System.out.println("(prueba1.equals(prueba3)): " + (prueba1.equals(prueba3)));

		String cadena1 = new String("Hola");
		String cadena2 = "Hola";
		String cadena3 = "Hola";
		String cadena4 = cadena1;

		System.out.println("(cadena1 == cadena2): " + (cadena1 == cadena2));
		System.out.println("(cadena2 == cadena3): " + (cadena2 == cadena3));
		System.out.println("(cadena1 == cadena4): " + (cadena1 == cadena4));
		System.out.println("(cadena1.equals(cadena2)): " + (cadena1.equals(cadena2)));
		System.out.println("(cadena2.equals(cadena3)): " + (cadena2.equals(cadena3)));

	}
}
