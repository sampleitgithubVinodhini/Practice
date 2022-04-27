package com.java;

public class StringTypes {

	//private static String lowerCase;

	public static void main(String[] args) {

		String s = "Good Morning Thiruvannamalai";

		int length=s.length();
		System.out.println("length "+ length);

		boolean equals = s.equals("Good Morning Thiruvannamalai");
		System.out.println("equals "+equals);

		boolean equalsIgnoreCase = s.equalsIgnoreCase("Good Morning Thiruvannamalai");
		System.out.println("equalsIgnoreCase "+equalsIgnoreCase);

		boolean startsWith = s.startsWith("G");
		System.out.println("startsWith "+startsWith);

		boolean endsWith = s.endsWith("i");
		System.out.println("endsWith "+endsWith);

		String upperCase = s.toUpperCase();
		System.out.println("upperCase "+upperCase);

		String lowerCase = s.toLowerCase();
		System.out.println("lowerCase "+ lowerCase);

		int indexOf = s.indexOf("M");
		System.out.println("indexOf "+ indexOf);

		char charAt = s.charAt(5);
		System.out.println("charAt "+ charAt);

		String trim = s.trim();
		System.out.println("trim "+trim);

		boolean empty = s.isEmpty();
		System.out.println("empty "+empty);

		String replace = s.replace("g", "sooo");
		System.out.println("replace "+replace);


		String substring = s.substring(4);
		System.out.println("substring "+substring);

		String substring2 = s.substring(4, 9);
		System.out.println("substring2 "+substring2);

	}

}
