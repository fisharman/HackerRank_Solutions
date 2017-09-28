import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * Problem: find date of 256th day of the year
 * 
 * sample input
 * 2017
 * 2016
 * 
 * sample output
 * 13.09.2017
 * 12.09.2016
 */
// java GregorianCalendar class is used to find the same day in Julian calendar
// to learn - object casting (GregorianCalendar) new Calendar.Buil....

public class Solution {

    static String solve(int year){
        // Complete this function
    	Calendar cal = Calendar.getInstance();
    	cal.set(Calendar.YEAR, 1918);
    	cal.set(Calendar.MONTH, Calendar.FEBRUARY);
    	cal.set(Calendar.DAY_OF_MONTH, 14);
    	Date gChange = cal.getTime();
    	
    	GregorianCalendar gCal = new GregorianCalendar();
    	gCal.setGregorianChange(gChange);
    	
    	cal.clear();
    	if (year == 1918)
    		cal = new Calendar.Builder().setFields(Calendar.DAY_OF_YEAR, 269, Calendar.YEAR, year).build();
    	else
    		cal = new Calendar.Builder().setFields(Calendar.DAY_OF_YEAR, 256, Calendar.YEAR, year).build();
    	
    	if (year%100 == 0 && year%400 != 0 && gCal.isLeapYear(year))
    		return String.format("%02d.%02d.%d", cal.get(Calendar.DAY_OF_MONTH) - 1, cal.get(Calendar.MONTH) + 1, cal.get(Calendar.YEAR));
    	else
    		return String.format("%02d.%02d.%d", cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.YEAR));
    	
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        in.close();
        String result = solve(year);
        System.out.println(result);
        
        
    }
}
