package exceptionTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.lang.NullPointerException;

public class ExceptionTest {

	/**
	 * Null pointer Exception Test
	 */
	
            public void createNullPointerException() throws NullPointerException{
		
		        throw new NullPointerException("Implicit Null Pointer Exception");
	              }
       /**
        * IO Exception Test
        * @throws FileNotFoundException
        * @throws IOException
        */

            public void testIOException()throws FileNotFoundException, IOException{
             //Reading properties file in Java example
              Properties props = new Properties();
              FileInputStream fis = new FileInputStream("c:/jdbc.properties");
  
              //loading properites from properties file
              props.load(fis);

             //reading proeprty
              String username = props.getProperty("jdbc.username");
              String driver = props.getProperty("jdbc.driver");
              System.out.println("jdbc.username: " + username);
              System.out.println("jdbc.driver: " + driver);
	           }
            
        /**
         * Run time exception, Array Out of Bound Exception    
         */
            
           public void testArrayOutofBoundException(){
        	   //Introduce the array out of bound exception
        	   int [] intArray = {1, 2};
        	   for (int i=0 ; i<= intArray.length; i++ ){
        		   System.out.println(intArray[i]);
        	    }
        	  }
           /**
            * Arithmetic exception
            */
           
           public void testArithmetic(){
        	   int i = 0;
        	   int j = 1;
        	   int t = j/1;
        	   
        		   
        	   }
        	   
//        	   try {
//        		   int t = j/0;
//        	   }
//        	   
//        	   catch (ArithmeticException e)
//        	   {
//        		   System.out.println(e.getStackTrace());
//        	   }
           }   

