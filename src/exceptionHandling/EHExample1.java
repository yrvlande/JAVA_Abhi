package exceptionHandling;

public class EHExample1 {
	
	public static void main(String args[]){
		
		try{
			if(args[0]=="Yash")
			throw new ArithmeticException("Hello");
			
		int i=	50/0;
		throw new ArithmeticException("Hello"); 
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("finally");
		}
		
	}
	
	

}
