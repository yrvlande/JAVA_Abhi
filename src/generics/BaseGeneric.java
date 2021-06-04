package generics;

public class BaseGeneric<T> {

           private T objVal=null;
           
           
           public BaseGeneric(T parmVal){
        	   this.objVal=parmVal;
        	   }
           
           
           public T getObjVal(){
        	    System.out.println(objVal.getClass().getName());   
        	   return this.objVal;
           }
           
         }
