package singleton;

public class SingleTon {
	private static SingleTon single;
	
	private SingleTon(){
	System.out.println("A");	
	}
	
	
	public static SingleTon getInstance(){
		if(single==null){
			single = new SingleTon();
		}
		return single;
	}
	
	
	public void fib(int num){
		int f1=1; int f2=2; int f3=1;
		
		for(int a=3; a<=num;a++){
			f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.print(" " +f3);
			
			
		}
		
	}
	
	
	public void fibonacciSeries (int num) {
		int f1 =1; int f2 = 1;
		System.out.print(f1 + " " + f2 );
		for (int a =3 ; a <= num ; a++) {
			int f3 = f1 + f2;
			System.out.print(" " + f3);
			f1 = f2;
			f2 = f3;
		}
	}
	
	public static int getNumberSum(int number){
        int sum=0;
        if(number == 0){
            return sum;
        } else {
        	System.out.println("--------" +number%10);
            sum += (number%10);
            getNumberSum(number/10);
        }
        return sum;
    }

     
	public static void main(String args[]){
		//SingleTon s = new SingleTon();
	SingleTon s= SingleTon.getInstance();
	
		System.out.println(getNumberSum(123));
		s.fibonacciSeries(12);
		
	}
	
	
}
