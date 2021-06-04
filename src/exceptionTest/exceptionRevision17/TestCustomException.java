package exceptionTest.exceptionRevision17;

public class TestCustomException {
	
	

	public void getString(String x) throws CheckedCustomException{
		if(x==null){
			
			throw new CheckedCustomException();
		}
		
		else{
			System.out.println("Valid String");
		}
		
	}
	
	
	public void testMessage() throws CheckedCustomException {
		
		this.getString("X");
	}
	
	
	public void getX(String x){
		if(x.equals("Yash")){
			throw new UncheckedException("Not Allowed");
		}
		else{
			System.out.println("Allowed");
		}
		
	}
	
	
	public void setX(){
		try{
		this.getX("Yash");}
		catch(UncheckedException e){
			e.printStackTrace();
		}
		System.out.println("IIIII");
	}
	
	
	public static void main(String[] args){
		
		TestCustomException tc = new TestCustomException();
		//System.out.println(tc.getClass().getName());
		try {
			tc.getString(null);
		} catch (CheckedCustomException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		
		tc.setX();
		System.out.println("HHHHHH");
	}

}
