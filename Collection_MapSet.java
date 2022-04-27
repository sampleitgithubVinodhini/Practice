package com.java;

import java.util.HashMap;
import java.util.Map;

public class Collection_MapSet {

	
	
	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap<Integer,String>();
		m.put(3, "suganya");
		m.put(2,"arun");
		m.put(1, "ajju");
		m.put(4,"string");
		m.put(3, "suganya");
		System.out.println(m);
		
		int size = m.size();
	System.out.println("size "+size);
	
	
	
	
	}
}
