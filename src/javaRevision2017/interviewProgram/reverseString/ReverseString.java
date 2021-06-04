package javaRevision2017.interviewProgram.reverseString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseString {
	
	public static void main (String[] args) {
		String name = "Yashwant";
		char[] charArr = name.toCharArray();
		int length = charArr.length;
		char[] revCharArr = new char[length];
		int indx = 0 ; 
			for (int j = length-1 ; j >= 0 ; j--) {
				revCharArr[j] = charArr[indx];
				indx++;
			}
	    String revString = new String (revCharArr);
	    System.out.println(revString);
		System.out.println(ReverseString.reverseByCollection(name));
		System.out.println(ReverseString.reverseByStream(name));
	}
	
	public static String reverseByCollection (String toRev) {
		char[] charArray = toRev.toCharArray();
		List<Character> charList = new ArrayList<Character>();
		for (char c : charArray) {
			charList.add(c);
		}
	    Collections.reverse(charList);
	    System.out.println(charList);
	    StringBuilder builder = new StringBuilder(charList.size());
	    for (char c : charList) {
	    	builder.append(c);
	    } 
	    return builder.toString();
	}
	
	public static String reverseByStream (String toRev) {
		char[] charArray = toRev.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (char c : charArray) {
			list.add(c);
		}
		
		
		Collections.reverse(list);
		
		System.out.println("--------" + list.toString());
		String revString = list.stream().map(
				e -> {
				System.out.println(""); // if single statement then block does not required and even not require 'return' keyword
				return e.toString();
				}).collect(Collectors.joining());
		
		list.stream().map(new Function<Character,String>() {
			public String apply (Character c) {
				return c.toString();
			} 
		}).collect(Collectors.joining());
		
		
		
		return revString;
	}

}
