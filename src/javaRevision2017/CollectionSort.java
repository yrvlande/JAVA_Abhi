package javaRevision2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.Set;
import java.util.TreeMap;

public class CollectionSort {
	
	
	public static void main(String args[]) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Yash", 4);
		map.put("Mahendra", 1);
		map.put("Rahul", 2);
		map.put("Manik", 3);
		System.out.println(map);
		Set<String> s1 = map.keySet();
		
		for(String s:s1) {
			System.out.println(s);
		}
		
		Iterator<String> itr = s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Map.Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Yash");
		al.add("Rahul");
		al.add("Abdul");
		al.add("Manik");

		System.out.println(al);
		
	Collections.sort(al);
	System.out.println(al);
	Collections.reverse(al);
	System.out.println(al);
	
	al.forEach(new Consumer<String>() {

		@Override
		public void accept(String t) {
			System.out.println("-"+t);
			
		}
	});
	
	
	
	
	System.out.println(al);
		
	}

}
