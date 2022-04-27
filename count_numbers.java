package com.java;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class count_numbers {
	public static void main(String[] args) {
		//1.take first word
		//2.compare with other words
		//3.increase the count if both match
		String s="Eclipse Run Window Eclipse Run Eclipse";
		Map<String, Integer> m=new HashMap<String, Integer>();
		String[] word_split = s.split(" ");
		for(String each:word_split)
		{
			if(m.containsKey(each))
			{
				Integer value = m.get(each);
				m.put(each, value+1);
			}
			else
			{
				m.put(each,1);
			}	
		}
		System.out.println(m);
		Set<Entry<String,Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {

			if(entry.getValue()>1)
			{
				System.out.println(entry);
			}
		}

	}
}
