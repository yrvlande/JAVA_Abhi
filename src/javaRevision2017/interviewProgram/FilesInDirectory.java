package javaRevision2017.interviewProgram;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FilesInDirectory {
	
	public static void main (String[] args) {
		
		File f = new File("C:\\DDrive\\Java_programs\\Eclipse\\Workspace\\MyPrograms\\src\\javaRevision2017\\interviewProgram\\dir");
		System.out.println(f.isDirectory());
		String[] files = f.list();
		Arrays.asList(files).stream().forEach(file->System.out.println(file));
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String val:files) {
			String ext = val.split("[.]")[1];
			map.put(ext, map.get(ext)==null ? 1 : map.get(ext)+1);
		}
		
		System.out.println(map);
		
		map.clear();
		//with Stream 
		
		Arrays.asList(files).stream().forEach(x -> {
			String ext = x.split("\\.")[1];
			
			map.put(ext, map.get(ext)==null ? 1 : map.get(ext)+1);
		});
		System.out.println(map);
		
	}

}
