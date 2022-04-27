package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collections {
	public static void main(String[] args) {

		List<Object> a=new ArrayList<Object>();
		a.add(80);
		a.add("en");
		a.add("suganya");
		a.add(2.4);
		a.add(98);
		a.add(80);
		a.add("e");
		System.out.println(a);

		Iterator<Object> it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		System.out.println("********************************");

		ListIterator<Object> li = a.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());

		}
		System.out.println("*****************");

		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}
}