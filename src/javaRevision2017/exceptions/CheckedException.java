package javaRevision2017.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * All Kind of Exception are Checked Exception except Error and RunTime Exception and their SUB classes
 * @author e1078064
 *
 */
public class CheckedException {

	
	public void method1() {
	File f = 	new File("");
		throw new NullPointerException();
	}
	
	public void method2() throws FileNotFoundException  {
	
		new FileInputStream(new File(""));
		
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		new CheckedException().method2();
		
		System.out.println("JJJJ");
	}
	
}
