package com.java;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {

		//	String s="suganya";
		//System.out.println("name is suganya");
		/*		
		if(s.contains("a"))
		{
			System.out.println("a  is here");
		}
		else
			System.out.println("a is not here");

		if(s.contains("e"))
		{
			System.out.println("e  is here");
		}
		else
			System.out.println("e is not here");

		if(s.contains("i"))
		{
			System.out.println("i  is here");
		}
		else
			System.out.println("i is not here");

		if(s.contains("o"))
		{
			System.out.println("o  is here");
		}
		else
			System.out.println("o is not here");

		if(s.contains("u"))
		{
			System.out.println("u is here");
		}
		else
			System.out.println("u is not here");


	System.out.println(s.length());
		 */

		
	
		
		int count=0;
		System.out.println("Enter your name");
	Scanner scan=new Scanner(System.in);
	
	String name=scan.nextLine();
	for (int i = 0; i <name.length(); i++)
	{
	char ch=name.charAt(i);
	if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
	{
	count ++;	
	}
	
	}
	System.out.println("Thedghgb");	
		System.out.println(count);
		
	}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		
		int count=0;
		System.out.println("Enter a name");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		for (int i=0 ; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
			{
				count ++;
			}

		}
		System.out.println("Number of vowel is");
	System.out.println(count);
	}
}
*/