package com.sngular.session.one;

public class PrincipalVarArgs {
	
	public static void varArgSize(String ...strings) {// 1 - 2 - 3
		System.out.println("Strings...");
		System.out.println(strings.length);
	}
	
	public static void varArgSize(CharSequence ...chars) {// 6
		System.out.println("CharSequence...");
		System.out.println(chars.length);
	}

	public static void varArgSize(StringBuilder sb, CharSequence ...chars){// 5
		System.out.println("SB - CharSequence...");
		System.out.println(chars.length);
	}
	
//	public static void varArgSize(String string, String ...strings) {
//		System.out.println("Overload Strings...");
//		System.out.println(strings.length);
//	}
	
	public static void varArgSize(Integer integer, String ...strings) {// 4
		System.out.println("Overload integer - strings");
		System.out.println(integer + strings.length);
	}
	
//	public static void varArgSize(String ...strings, Integer integer) {
//	 	System.out.println("Overload strings - integer");
//		System.out.println(integer + strings.length);
//	}

	public static void main(String[] args) {
		varArgSize();// 1
		varArgSize("1");// 2
		varArgSize("1", "2", "3", "4");// 3
		
		varArgSize(1, "1", "2", "3");// 4
		
		varArgSize(new StringBuilder(), new StringBuffer(), new StringBuilder(), "");// 5
		varArgSize(new StringBuffer(), new StringBuffer(), new StringBuilder(), "");// 6
	}

}
