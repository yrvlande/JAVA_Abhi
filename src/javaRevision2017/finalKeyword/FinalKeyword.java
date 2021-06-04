package javaRevision2017.finalKeyword;

/**
 * The final Keyword at Class Level, Then the class can not be inherited.
 * Final Variable if not been initialize while declaration then it can be only done at constructor, if initialize at declaration then cant reinitialize at constructor too.
 * The Final Method can not be override
 * @author Yashwant.Lande
 *
 */

public final class FinalKeyword {
	
	public final int val;
	
	public FinalKeyword(){
		val=20;
	}
	
	
	protected final void method1(){
		
		
	}

}
