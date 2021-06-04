package testPackage;
import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

public class testClass {

	public void testMethod (){
		
		Map <String, List<String>> map = new HashMap<String, List<String>>();
		
		
		//add ipp product
		List<String> infinityProduct = new ArrayList<String>();
		infinityProduct.add("IPP");
		infinityProduct.add("IR");
		
		//add sungard domain product
		List<String> domainProduct = new ArrayList<String>();
		domainProduct.add("sun1");
		domainProduct.add("sun2");
		map.put("Infinity", infinityProduct);
		map.put("Sungard", domainProduct);
		
		// Display the Value of Infinity and Sungard Product
		
		for(Map.Entry<String, List<String>> entry: map.entrySet()) {
			
		
		}
		
		
		
		
		for (Map.Entry<String, List<String>> entry :  map.entrySet()){
			
			String keyValue = entry.getKey();
			System.out.println("The Key Value --> " +keyValue );
			
			List<String> values = entry.getValue();
			System.out.println("and values of Key are --> " +values );
			
			}
		
	} 
	
	
}
