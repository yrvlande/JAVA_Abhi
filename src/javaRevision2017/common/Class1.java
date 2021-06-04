package javaRevision2017.common;

public class Class1 {
	String str1;
	public String getVal() {
		
		Intf1 inf = new Intf1() {
			
			@Override
			public void setString(String s) {
			str1=s;
				
			}
			
			@Override
			public String getString() {
				// TODO Auto-generated method stub
				return str1;
			}
		};
		
		inf.setString("FIS");
		return inf.getString();
	}
	
	public static void main(String[] args) {
		Class1 c = new Class1();
		
		System.out.println(c.getVal());
	}

}
