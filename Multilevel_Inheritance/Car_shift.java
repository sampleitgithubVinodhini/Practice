package com.java.Multilevel_Inheritance;

public class Car_shift extends Class_KIA {

	public void name()
	{
		System.out.println("shift");
	}

	public void price()
	{
		System.out.println("8k");
	}

	public static void main(String[] args) {
		Car_shift s=new Car_shift();
		s.car();
		s.color();
		s.name();
		s.price();
	
	}

}
