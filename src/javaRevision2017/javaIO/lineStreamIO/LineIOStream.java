package javaRevision2017.javaIO.lineStreamIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LineIOStream {
	
	public static void main(String args[]) {
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br= new BufferedReader(new FileReader(new File("C:\\DDrive\\Java_programs\\Eclipse\\Workspace\\MyPrograms\\src\\javaRevision2017\\javaIO\\byteStreamExample\\TestInputFile.txt")));
			bw= new BufferedWriter(new FileWriter(new File("C:\\DDrive\\Java_programs\\Eclipse\\Workspace\\MyPrograms\\src\\javaRevision2017\\javaIO\\byteStreamExample\\TestOutputFile.txt")));
	
	       String s;
	       while((s=br.readLine())!=null) {
	    	   
	    	   System.out.println(s);
	    	   bw.write(s);
	    	   
	       }
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
		try {
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
	}

}
