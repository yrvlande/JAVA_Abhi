package javaCollection;

public class TestClass1 {
	
	public String custName;
	public String custLastName;
	public long custMobNo;
	public TestClass1(String custName, String custLastName, long custMobNo){
		this.custName=custName;
		this.custLastName=custLastName;
		this.custMobNo = custMobNo;
	}

	public TestClass1 getCust(){
		return this;
	}
	
	
}
