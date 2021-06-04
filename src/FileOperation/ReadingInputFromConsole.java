package FileOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReadingInputFromConsole {
	
	
	
	public static void comp(){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("a", 5);
		map.put("a", 9);
		map.put("a", 4);
		map.put("a", 8);
		
		Set<Entry<String, Integer>> set = map.entrySet();
	     ArrayList<Entry<String, Integer>> list= new ArrayList<Entry<String, Integer>>(set);
	     
	     Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){

			@Override
			public int compare(Map.Entry<String, Integer> o1,
					Map.Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
	    	 
	    	 
	    	 
	     });
	     
	     for(Map.Entry<String, Integer> entry: list){
	    	 
	    	 System.out.println(entry.getKey()+entry.getValue());
	     }
	     
		
		
		
	}
	
	

	public static void main(String args[]) throws IOException{
		
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		String s = br.readLine().toString();
		//System.out.println(s);
		comp();
	
		
		
		
	}
	
	
}
