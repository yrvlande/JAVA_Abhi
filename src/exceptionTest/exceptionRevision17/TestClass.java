package exceptionTest.exceptionRevision17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestClass {
	
	
	public String concateToString(String inStr)  {
		try{
		FileReader fileReader = new FileReader(new File("./"));
		}
		catch (FileNotFoundException f){
			//f.printStackTrace();
			System.out.println("Failed Due to \n" +f.getLocalizedMessage());
			f.printStackTrace();
			System.out.println(f.getMessage());
		}
		try{
		return "Hi ".concat(inStr);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			return null;
		}
		finally{
			
		}
	}
	
	public String joiner(String inStr) {
		
		return concateToString(inStr);
	}
	
	public static void main(String[] args) {
		
		TestClass t = new TestClass();
		String x = t.joiner(null);
		System.out.println(x);
		System.out.println("con...");
		
	}

	
	
}
