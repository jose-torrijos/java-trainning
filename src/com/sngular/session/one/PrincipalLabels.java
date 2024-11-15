package com.sngular.session.one;

import java.util.Random;

public class PrincipalLabels {

	public static void main(String[] args) {
		Random random = new Random();
		int [] arregloNumeros = new int[10];
		int contadorPares = 0;
		
		for(int i = 0; i < arregloNumeros.length; i++) {
			arregloNumeros[i] = random.nextInt();
		}
		
		int idx = 0;
		PRINCIPAL: while(idx < arregloNumeros.length) {
			System.out.println(arregloNumeros[idx]);
			if(arregloNumeros[idx++] % 2 == 0) {
				contadorPares++;
				break PRINCIPAL;
			} else {
				System.out.println("No es par");
			}
		}
		
		System.out.println("Total de numeros pares: " + contadorPares);
	}
}
