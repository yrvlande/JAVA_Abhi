package javaRevision2017.javaIO.byteStreamExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWithFileInputStream {
	
	public static void main(String args[]) {
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis= new FileInputStream(new File("C:\\DDrive\\Java_programs\\Eclipse\\Workspace\\MyPrograms\\src\\javaRevision2017\\javaIO\\byteStreamExample\\TestInputFile.txt"));
			fos= new FileOutputStream(new File("C:\\DDrive\\Java_programs\\Eclipse\\Workspace\\MyPrograms\\src\\javaRevision2017\\javaIO\\byteStreamExample\\TestOutputFile.txt"));
			
			int c;
			while((c=fis.read())!=-1) {
				
				fos.write(c);
				
				System.out.println(new Integer(c).byteValue());
				char c1 = (char) c;
				System.out.println(c);
				System.out.println(c1);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
			
			if(fos !=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
