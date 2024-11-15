package com.sngular.session.one;

public class PrincipalSwitch {
	
	public static void test(int c) {
		switch (c++) {
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;
		case 3:
			System.out.println("Tres");
			break;
		default:
			System.out.println("Cero");
			break;
		}
		
		System.out.println(c);
	}

	public static void main(String[] args) {
		Integer valor = 1;
		
		test(valor);
		
		switch (--valor) {
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;
		case 3:
			System.out.println("Tres");
			break;
		default:
			System.out.println("Cero");
			break;
		}

		
		switch (++valor) {
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;
		case 3:
			System.out.println("Tres");
			break;
		default:
			System.out.println("Cero");
			break;
		}
		
		switch (args.length) {
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;
		case 3:
			System.out.println("Tres");
			break;
		default:
			System.out.println("Cero");
			break;
		}

		System.out.println("Valor: " + valor);

	}

}
