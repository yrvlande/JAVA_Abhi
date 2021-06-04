package javaRevision2017.javaIO;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

public class FileCount {
	
	public static void main(String args[]) {
		
	
		File folder = new File("C:\\development\\Cobertura\\ReportParser\\ReportParser\\lib");
		
	File[] files=folder.listFiles();
		
	System.out.println(files.length);
	int startsWithCarnot=0;
	int startsWithIPP=0;
	int startsWithStardust=0;
	int other=0;
	for(File file: files) {
		
		if(file.getName().startsWith("carnot")) {
			startsWithCarnot++;
		}
		else if(file.getName().startsWith("ipp")) {
			startsWithIPP++;
		}
		else if(file.getName().startsWith("stardust")) {
			startsWithStardust++;
		}
		
		else {
			other++;
		}
	}
	
	System.out.println("Starts With Carnot: " +startsWithCarnot);
	System.out.println("Starts With IPP: " +startsWithIPP);
	System.out.println("Starts With Stardust: " +startsWithStardust);
	System.out.println("Others: " +other);
		
	
	Map<String,Integer> map1 = new LinkedHashMap<>();
	
	for (File file : files) {
		
		if(file.getName().startsWith("carnot")) {
			Integer i1 = map1.get("carnot");
			map1.put("carnot", i1==null ? 1 : i1+1);
		}
		
		else if (file.getName().startsWith("ipp")) {
			 Integer i2 = map1.get("ipp");
			 map1.put("ipp", i2 == null ? 1 : i2+1);
		}
		else if (file.getName().startsWith("stardust")) {
			  Integer i3 = map1.get("stardust");
			  map1.put("stardust", i3 == null ? 1 : i3+1);
		}
		else {
			Integer i4 = map1.get("OtherFiles");
			map1.put("OtherFiles", i4==null ? 1 : i4+1);
		}
	}
	System.out.println(map1);
	
	}
	
	
	
	
	
	
	

}
