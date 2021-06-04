package javaRevision2017.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;

public class ExampleofTryWithResourceStatement {
	
	
	public static void main(String args[]) {
		
		try {
			int i = 1/0;
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
      
	}

}
