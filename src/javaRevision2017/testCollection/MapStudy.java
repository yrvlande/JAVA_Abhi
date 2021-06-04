package javaRevision2017.testCollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapStudy {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		map.put("ABC",null);
		map.put("XYZ",null);
		map.put("PQR",3);
		map.put("PQR",4);
		
		
		System.out.println(map);
		System.out.println(map.get("XYZ"));
		Set<String> setKeys = map.keySet();
		System.out.println(setKeys);
		Collection<Integer> vals = map.values();
		
		System.out.println(vals);
		
		
		Set<Entry<String, Integer>> se =map.entrySet();
		
		for(Map.Entry<String, Integer> ent: se) {
			ent.getKey();
			
			
		}
		
		
		
		
		
	}

}
