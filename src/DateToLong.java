import java.util.*;
import java.text.*;

public class DateToLong {
  public static void main(String[] args) {
    try {
		
      String str_date="01/05/12 06:38 PM";
      SimpleDateFormat formatter ;
      Date date;
     formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'Z'");
     System.out.println("Hi");
     date = (Date)formatter.parse(str_date);
      long longDate=date.getTime();
      System.out.println("Today is " +longDate );
    }
  catch (ParseException e){
  System.out.println("Exception :"+e);
  e.getStackTrace();
}
    finally {
    	System.out.println("Hi");
    }
    
//    catch (RuntimeException e){
//      System.out.println("Exception :"+e);
//      e.getStackTrace();
//    }

//    catch (Throwable e){
//        System.out.println("Exception :"+e);
//        e.getStackTrace();
//      }
    
  }
}
