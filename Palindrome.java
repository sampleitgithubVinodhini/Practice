package com.java;

public class Palindrome {

	public static void main(String[] args) {
		
		
		int rem=0,num=1234,rev=0,temp=num;
		
		while(num!=0)
		{
			rem=rem*10+num%10;
			num=num/10;
			
			}
		rev=rem;
		System.out.println("Reverse number is"+ rev);
		
		if(rev==temp)
		{
			System.out.println("num is palindrome");
		}
		
		else
		{
			System.out.println("not palindrome");
		}
		
		
	}
}
