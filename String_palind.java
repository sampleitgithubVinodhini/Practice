package com.java;

public class String_palind {

	public static void main(String[] args) {
		
	
	
	
	
	
	
	String S = "suganya";
	String S2 = "";
	
	System.out.println(S);

	for (int i = S.length() - 1; i >= 0; i--)   
	S2 = S2 + S.charAt(2);
System.out.println(S2);

	if (S.equalsIgnoreCase(S2)) {

		System.out.println("palindrome");

	}

	else {

		System.out.println("not a palindrome");

	}

}

}
	
	
	
	




