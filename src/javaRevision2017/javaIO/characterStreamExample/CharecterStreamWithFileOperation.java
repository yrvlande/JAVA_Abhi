package javaRevision2017.javaIO.characterStreamExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharecterStreamWithFileOperation {
	
	public static void main(String args[]) {
		
		FileReader fr=null;
		FileWriter fw=null;
		
		try {
			fr= new FileReader(new File("C:\\DDrive\\Java_programs\\Eclipse\\Workspace\\MyPrograms\\src\\javaRevision2017\\javaIO\\byteStreamExample\\TestInputFile.txt"));
			fw= new FileWriter(new File("C:\\DDrive\\Java_programs\\Eclipse\\Workspace\\MyPrograms\\src\\javaRevision2017\\javaIO\\byteStreamExample\\TestOutputFile.txt"));
			
			int c;
			while((c=fr.read())!=-1) {
				fw.write(c);
				
				System.out.println(new Integer(c).byteValue());
				System.out.println(Integer.bitCount(c));
				System.out.println(new Integer(c).SIZE);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
	}

}
