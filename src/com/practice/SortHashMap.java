package com.practice;

import java.util.*;
import java.util.Map.Entry;

public class SortHashMap {

	public static void main(String[] args) {
	
		Map<String, Integer> map= new HashMap<>();
		
		map.put("Adarsh", 105);
		
		map.put("Amiya", 109);
		
		map.put("Chintu", 103);
		
		map.put("Pramod", 104);
		
		System.out.println("Before Sorting the value");
		
		map.forEach((k,v)->System.out.println(k+"\t"+v));
		
		Set<Entry<String, Integer>> entrySet= map.entrySet();
		List<Entry<String, Integer>> list= new ArrayList<>(entrySet);
		Collections.sort(list, new Comparator<Entry<String, Integer>>(){
				
				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			
			return o1.getValue().compareTo(o2.getValue());
				}
			
		});
		
		System.out.println("After sorting the value");
		
		list.forEach(s->{ System.out.println(s.getKey()+"\t"+s.getValue());
			
		});
				
	}

}
