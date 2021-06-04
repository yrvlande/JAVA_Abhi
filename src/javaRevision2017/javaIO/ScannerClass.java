package javaRevision2017.javaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		try {
			Scanner s = new Scanner(new FileReader(new File("C:\\DDrive\\Java_programs\\Eclipse\\Workspace\\MyPrograms\\src\\javaRevision2017\\javaIO\\byteStreamExample\\TestInputFile.txt")));
			Map<String, Integer> hsMap = new LinkedHashMap<String, Integer>();
			Map<Character,Integer> hsMap1 = new LinkedHashMap<Character,Integer>();
			while(s.hasNext()) {
				String str = s.next();
				System.out.println(str);
				
				Integer val = hsMap.get(str);
				hsMap.put(str, val==null?1 : val+1 );
				char[] charArr = str.toCharArray();
				
				for(char c:charArr) {
					Integer i1 = hsMap1.get(c);
					hsMap1.put(c, i1==null?1:i1+1);
				}
				
				
				
			    }
			System.out.println(hsMap);
			System.out.println(hsMap1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
