package com.java;

public class prime_number {

	public static void main(String[] args) {

		int n;
		for (n = 1;n<=10;n++) {
			int count=0;
			for (int i = 2; i <n; i++) {
				if (n % i == 0) {
					count++;
				}
			}

			if(count==0)
			{
				System.out.println(n + "  is prime number");
			}
			else
			{
				System.out.println(n + " is not prime");
			}
		}
	}

}
