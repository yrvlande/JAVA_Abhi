package javaRevision2017.javaIO;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class PathClassDemo {
	
	public static void main(String args[]) {
		Path p1 = Paths.get("C:\\DDrive\\Songs\\data");
		
		System.out.println(p1.getFileName());
		System.out.println(p1.getParent());
		System.out.println(p1.getRoot());
		System.out.format("%s%n", p1.getName(0));
		
		Iterator<Path> itr = p1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			}
	}

}
