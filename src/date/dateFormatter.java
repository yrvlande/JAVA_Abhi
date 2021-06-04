package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import sun.util.calendar.Gregorian;

public class dateFormatter {

	public static void main(String args[]){
		
		GregorianCalendar cal = (GregorianCalendar) Calendar.getInstance();
		String pattern = "EEE MMM dd yyyy";
		SimpleDateFormat simpleDate = new SimpleDateFormat(pattern);
		System.out.println(simpleDate.format(cal.getTime()));
		
		
	}
}
