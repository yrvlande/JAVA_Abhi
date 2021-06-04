package javaRevision2017.testCollection.collectionRevesion.mapCollectionExample;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample {
	
	public static void main (String args[]) {
		
		Dictionary dic1 = new Dictionary();
		dic1.setCity("Rajura");
		dic1.setPinCode(442905);
		Dictionary dic2 = new Dictionary();
		dic2.setCity("Pune");
		dic2.setPinCode(411019);
		Dictionary dic3 = new Dictionary();
		dic3.setCity("Mumbai");
		dic3.setPinCode(400100);
		Dictionary dic4 = new Dictionary();
		dic4.setCity(null);
		dic4.setPinCode(411122);
		
		Map<String,Long> dicMap = new HashMap<>();
		dicMap.put(dic1.getCity(), dic1.getPinCode());
		dicMap.put(dic2.getCity(), dic2.getPinCode());
		dicMap.put(dic3.getCity(),dic3.getPinCode());
		dicMap.put(dic4.getCity(),dic4.getPinCode());
		
		
		Set<String> cities = dicMap.keySet();
		System.out.println(cities);

		Collection<Long> codes = dicMap.values();
		System.out.println(codes);
		
		
		Set<Map.Entry<String, Long>> entrySet = dicMap.entrySet();
		for (Map.Entry<String,Long> entry : entrySet ) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		
		Map<String, Long> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.putAll(dicMap);
		Set<Map.Entry<String,Long>> entrySet1=linkedHashMap.entrySet();
		
		for (Map.Entry<String, Long> entry : entrySet1 ) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		Map<Dictionary, Integer> treeMapObj = new TreeMap<>();
		   treeMapObj.put(dic1, 1);
		   treeMapObj.put(dic2, 2);
		   treeMapObj.put(dic3, 3);
		   treeMapObj.put(dic4, 4);
		   
		   Set<Dictionary> dicSet = treeMapObj.keySet();
		   dicSet.stream().forEach((x) -> { System.out.println(x.getPinCode());});
		   
	}
	
	
}
