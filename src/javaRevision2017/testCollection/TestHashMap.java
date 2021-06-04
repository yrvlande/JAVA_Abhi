package javaRevision2017.testCollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestHashMap {
	
	
	public static void main(String args[]){
		
		Map<String,Integer> m = new HashMap<String,Integer>();
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		
		m.put("Yash", 1);
		m.put("Mahendra", 2);
		
		m1.put("Yash", 5);
		m1.put("Mahendra", 4);
		
		System.out.println(m.hashCode());
		System.out.println(m1.hashCode());
		
		m.putAll(m1);
		
		
		
//		System.out.println(m.containsKey("Rahul1"));
//		System.out.println(m.containsValue(21));
//		System.out.println(m);
//		
		//System.out.println(m.equals(m1));
		
		
		/*
		 * Verify the out put using all three java platform implemented MAPS.
		 */
		//Map<String,Integer> m2 = new HashMap<String,Integer>();
		//Map<String,Integer> m2 = new LinkedHashMap<String,Integer>();
		Map<String,Integer> m2 = new TreeMap<String,Integer>();
		
		for(String val1:args){
			
			Integer freq= m2.get(val1);
			m2.put(val1, freq==null?1:freq+1);
		}
		
		System.out.println(m2);
		System.out.println(m2.keySet());
		System.out.println(m2.values());
		
		Set<String> keyS= m2.keySet();
		Iterator<String> itr = keyS.iterator();
		
		while(itr.hasNext()){
			//System.out.println(itr.next());
			
			if(itr.next().equals("Mangesh")){
				//itr.remove();
			}
		}
		
		System.out.println(keyS);
		System.out.println(m2);
		
		Map<Student,Standard> u = new TreeMap<Student, Standard>();
		u.put(new Student(9, "st1"), new Standard(10));
		u.put(new Student(10, "st2"), new Standard(11));
		u.put(new Student(60, "st3"), new Standard(12));
		u.put(new Student(55, "st3"), new Standard(13));
		System.out.println(u);
		
		Set<Student> studentSet =  u.keySet();
		Collection<Standard> standardSet = u.values();
		System.out.println(studentSet.size());
		System.out.println(studentSet);
		System.out.println(standardSet);
		
		
		
		Standard s = u.get(new Student(10, "st2"));
		System.out.println(s.getSTD());
		
		Iterator<Student> itr1= studentSet.iterator();
		
		while(itr1.hasNext()){
			System.out.println(itr1.next().getID());
		}
		
		
		}

}
