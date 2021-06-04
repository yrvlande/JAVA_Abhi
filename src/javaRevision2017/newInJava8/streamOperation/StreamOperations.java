package javaRevision2017.newInJava8.streamOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public interface StreamOperations {
	
	public static void main (String[] args) {
		String[] strArray = {"A", "ZA","CA", "Y", "Q" };
		int[] intArray = {1, 9, 2, 8, 6};
		
		//intermidiate stream operation like map, sorted, filter, that returns stream object again
		List<String> strList = Arrays.asList(strArray);
		
		List<String> newstrList = strList.stream().map(x-> x+"A").collect(Collectors.toList());
		System.out.println(newstrList);
		
	     newstrList = newstrList.stream().sorted().collect(Collectors.toList());
	     System.out.println(newstrList);
	     
	     newstrList = newstrList.stream().filter(x->x.endsWith("AA")).collect(Collectors.toList());
	     System.out.println(newstrList);
		
	     //Terminal operation like collect, forEach, reduce that dont returns stream object
	     newstrList.stream().forEach(f -> System.out.println(f.charAt(0)));
	     
	     
	     
	     
	}

}
